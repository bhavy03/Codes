package com.bhavya;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {24, 365, 4, 2, 57, 2000};
        System.out.println(findNumbers(nums));
        System.out.println(digits(562684));
        System.out.println(digits2(2684));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //function to check whether it contains even digit or not
    //to check even no of digit we follow this
    //count the number of digit and then convert into string as string gives length and then take the length
    static boolean even(int num) {
        int numberofDigits = digits(num);
//        if (numberofDigits % 2 == 0){
//            return true;
//        }
//        return false;
//    }
//       or
        return numberofDigits % 2 == 0;
    }

    //count no of digits in anumber
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;   //num /= 10
        }
        return count;
    }

    static int digits2(int num) {    //shortcut to find number of digit
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
