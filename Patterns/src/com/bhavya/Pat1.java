package com.bhavya;

public class Pat1 {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(4);
        System.out.println();
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("* ");
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            // for every row run the column
            int totalColsInRows = row > n ? ((2 * n) - (row)) : row;
            for (int col = 1; col <= totalColsInRows; col++) {
                System.out.print("* ");
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            // for every row run the column
            int totalColsInRows = row > n ? ((2 * n) - (row)) : row;

            int noOfSpaces = n - totalColsInRows;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRows; col++) {
                System.out.print("* ");
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            // for every row run the column
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int s = 0; s < n - c; s++) {
                System.out.print(" ");
            }
            // for every row run the column
            for (int col = c; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col);
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern9(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            // for every row run the column
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern10(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            // for every row run the column
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern11(int n) {
        int originalN = n+1;
        n = 2 * n;
        for (int row = 1; row < n; row++) {
            // for every row run the column
            for (int col = 1; col < n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
//            when one row is printed we need to add a new line
            System.out.println();
        }
    }
}
