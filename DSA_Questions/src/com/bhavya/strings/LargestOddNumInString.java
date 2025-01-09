package com.bhavya.strings;

public class LargestOddNumInString {
    public static void main(String[] args) {
        String num = "35426";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
//        String charToString = String.valueOf(num.charAt(num.length() - 1));
//        int stringToInt = Integer.parseInt(charToString);
//        if (stringToInt % 2 != 0) {
//            return num;
//        }
//        String ans = "";
//        for (int i = num.length() - 1; i >= 0; i--) {
//            String string_temp = String.valueOf(num.charAt(i));
//            int int_temp = Integer.parseInt(string_temp);
//            if (int_temp % 2 == 0) {
//                ans = num.substring(0, i);
//            } else {
//                return ans;
//            }
//        }
//        return ans;
    }
}

//    public static String largestOddNumber(String num) {
//        String number = "";
//        int j = num.length() - 1;
//        for (int i = j; i > 0; i--) {
//            if (num.charAt(j) % 2 == 0) {
//                j--;
//            }
//            if (num.charAt(j) % 2 != 0) {
//                for (int k = 0; k <= j; k++) {
//                    number = number + num.charAt(k);
//                }
//                break;
//            }
//        }
//        if(number == " ")
//            return num;
//        return number;
//    }
