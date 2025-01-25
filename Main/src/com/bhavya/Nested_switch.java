package com.bhavya;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Bhavya soni");
                break;
            case 2:
                System.out.println("Kunal kushwaha");
                break;
            case 3:
                System.out.println("Rahul rana");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }

//        switch (empID) {
//            case 1 -> System.out.println("Bhavya soni");
//            case 2 -> System.out.println("Kunal kushwaha");
//            case 3 -> {
//                System.out.println("Rahul rana");
//                switch (department) {
//                    case "IT" -> System.out.println("IT department");
//                    case "Management" -> System.out.println("Management department");
//                    default -> System.out.println("No department entered");
//                }
//            }
//            default -> System.out.println("Enter correct empID");
    }
}