package com.bhavya.basic;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        int anss = 0;

        while (n > 0) {
            int temp = n;
            temp = temp % 10;
            if (temp % 2 == 0) {
                ans = ans + temp;
            }else {
                anss = anss + temp;
            }
            n = n / 10;
        }

        System.out.print(ans + " " + anss);
    }
}
