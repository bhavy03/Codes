package com.bhavya.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 3, 1, 4, 5};
        System.out.println(missingIfSorted(arr));
        System.out.println(bruteforce(arr));
        System.out.println(summation(arr));
        System.out.println(xor(arr));
        System.out.println(missingNumber(arr));
    }

    public static int missingIfSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                return (arr[i + 1] + arr[i]) / 2;
            }
        }
        return -1;
    }

    //    Brute force in which we use flag variable
    public static int bruteforce(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        return -1;
    }

    //    can be done using hashing
//    Optimal approach 1 using summation we subtract all-sum to sum of natural numbers
    public static int summation(int[] arr) {
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int allsum = 0;
        for (int i = 0; i < arr.length; i++) {
            allsum += arr[i];
        }
        return sum - allsum;
    }

    //    Optimal approach 2 is using XOR, and it has two properties
//    XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
//    XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2
    public static int xor(int[] arr) {
        int N = arr.length;
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < N; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N]
        }
//        xor1 = xor1 ^ N; //XOR up to [1...N]
        return (xor1 ^ xor2); // the missing number
    }


    //    we can also create another array and store every item in it
    public static int missingNumber(int[] a) {
        int N = a.length;
        int hash[] = new int[N + 1]; //hash array

        // storing the frequencies:
        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        //checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }
}
