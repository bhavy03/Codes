package com.bhavya.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNname {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(printNtimes(n));
    }

    public static List<String> printNtimes(int n) {
        List<String> List = new ArrayList<>();
        return helper(n, List);
    }

    public static List<String> helper(int n, List<String> List) {

        if (n == 0) {
            return List;
        }
        List.add("Coding Ninjas");
        return helper(n - 1, List);
    }
}
