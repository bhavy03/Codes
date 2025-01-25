package com.bhavya;

public class Main {
    public static void main(String[] args) {
int ans = find_nth_term(5);
        System.out.println(ans);
    }
    public static int recursive(int i, int j, int ithPowerOf3, int jthPowerOf3, int counter, int n) {
        if (counter==n) {
            if (j==0) {
                return ithPowerOf3;
            } else {
                return ithPowerOf3+jthPowerOf3;
            }
        } else {
            if (j==i) { // increasing the bigger series number
                return recursive(i+1, 0, ithPowerOf3*3, 1, counter+1, n);
            } else { // increasing the smaller series number
                return recursive(i, j+1, ithPowerOf3, jthPowerOf3*3, counter+1, n);
            }
        }
    }

    public static int find_nth_term(int n) {
        return recursive(1, 0, 3, 1,1, n);
    }

}
