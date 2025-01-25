package com.bhavya.questions;

import java.util.Scanner;

public class Smallest_letter {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        char target = 'm';
        System.out.println(ceiling(new char[]{'a','c','j','l'},target));
    }

    static char ceiling(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

}


