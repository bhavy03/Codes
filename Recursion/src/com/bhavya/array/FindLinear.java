package com.bhavya.array;

import java.util.ArrayList;

public class FindLinear {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 5, 44};
        System.out.println(find(arr, 4, 0));
        System.out.println(finding(arr, 4, 0));
        System.out.println(findingLast(arr, 4, arr.length - 1));
        findingAll(arr, 4, 0);
        System.out.println(List);
        System.out.println(findingArraylist(arr, 4, 0, new ArrayList<>()));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findingArraylist(arr, 4, 0, list));
        System.out.println(findingArraylist2(arr,4,0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int finding(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return finding(arr, target, index + 1);
    }

    static int findingLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findingLast(arr, target, index - 1);
    }

    static ArrayList<Integer> List = new ArrayList<>();

    static void findingAll(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            List.add(index);
        }
        findingAll(arr, target, index + 1);
    }

    static ArrayList<Integer> findingArraylist(int[] arr, int target, int index, ArrayList<Integer> List) {
        if (index == arr.length) {
            return List;
        }
        if (arr[index] == target) {
            List.add(index);
        }
        return findingArraylist(arr, target, index + 1, List);
    }

    static ArrayList<Integer> findingArraylist2(int[] arr, int target, int index) {
        ArrayList<Integer> List = new ArrayList<>();
        if (index == arr.length) {
            return List;
        }
//        this will contain ans for that function call only
        if (arr[index] == target) {
            List.add(index);
        }
        ArrayList<Integer> ansFrombelowCalls = findingArraylist2(arr, target, index + 1);
        List.addAll(ansFrombelowCalls);
        return List;
    }
}
