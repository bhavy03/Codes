package com.bhavya.strings;

public class RotateString {
    public static void main(String[] args) {
        String s = "gcmbf";
        String goal = "fgcmb";
        System.out.println(rotateStrings(s, goal));
        System.out.println(rotateString(s,goal));
    }

    public static boolean rotateStrings(String s, String goal) {

        if (s.length() != goal.length()) return false;
//        System.out.println(s+s);
        return (s + s).contains(goal);
    }


//    it is too much naive solution
    public static boolean rotateString(String A, String B) {
        if (A == null || B == null) {
            //throw exception on A and B both being null?
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }
        if (A.length() == 0) {
            return true;
        }
        for (int i = 0; i < A.length(); i++) {
            if (rotateString(A, B, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean rotateString(String A, String B, int rotation) {
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt((i + rotation) % B.length())) {
                return false;
            }
        }
        return true;
    }

//    public static boolean rotateString(String s, String goal) {
//        char start = s.charAt(0);
//        int end = goal.indexOf(start);
//        if(end == 0){
//            return false;
//        }
////        System.out.println(start);
////        System.out.println(end);
//
//        StringBuilder str = new StringBuilder();
//        for (int i = end - 1; i < s.length(); i++) {
//            str.append(s.charAt(i));
//        }
//        for (int i = 0; i < end - 1; i++) {
//            str.append(s.charAt(i));
//        }
//        String ans = str.toString();
//        System.out.println(ans);
//        System.out.println(goal);
////        System.out.println(str);
//        if(ans.equals(goal)) {
//           return true;
//        }
//        return false;
//    }
}
