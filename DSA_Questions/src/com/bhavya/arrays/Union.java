package com.bhavya.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 4, 5};
        int[] arr2 = {1, 1, 2, 3, 4};
        int n = arr1.length;
        int m = arr2.length;
        union(arr1, arr2);
        System.out.println(FindUnion(arr1, arr2, n, m));
    }

    //  Time Complexity : O( (m+n)log(m+n) ) .
//  Inserting an element in a set takes logN time, where N is no of elements in the set.
//  At max set can store m+n elements {when there are no common elements and elements in arr,arr2 are distntict}.
//  So Inserting m+n th element takes log(m+n) time. Upon approximation across inserting all elements in worst,
//  it would take O((m+n)log(m+n) time.
//  Using HashSet also takes the same time, On average insertion in unordered_set takes O(1) time
//  but sorting the union vector takes O((m+n)log(m+n)) time.
//  Because at max union vector can have m+n elements.
//  Space Complexity : O(m+n) {If Space of Union ArrayList is considered}
    public static void union(int[] arr1, int[] arr2) {
        List<Integer> arrlist = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            arrlist.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arrlist.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            set.add(arrlist.get(i));
        }
//        if want to return the arrlist
//        arrlist.clear();
//        for (int element : set) {
//            arrlist.add(element);
//        }
//        return arrlist;
//        System.out.println(arrlist);
        System.out.println(set);
    }


    //  Here is the optimal solution it is like the merge sort merging
//    Time Complexity: O(m+n), Because at max i runs for n times and j runs for m times.
//    When there are no common elements in arr1 and arr2 and all elements in arr1, arr2 are distinct.
//    Space Complexity : O(m+n) {If Space of Union ArrayList is considered}
//    O(1) {If Space of union ArrayList is not considered}
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
