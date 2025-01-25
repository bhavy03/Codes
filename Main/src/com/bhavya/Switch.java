package com.bhavya;

import java.util.Objects;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit name");
        String fruit = in.next();

//    if (Objects.equals(fruit, "mango")){
//    System.out.println("King of fruit");

//        switch statement
//        cases have to be of same type as expressions,must be a constant or literal
//        duplicate case values are not allowed
//        break is used to terminate the sequence
//        if break is not used,it will continue to next case
//        default will execute when none of the above does
//        if default is not at the end,put break after it

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }

//        Enhanced switch statement

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }

        System.out.println("Enter any number between 1 to 7");
        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please enter a valid fruit");
//        }

//        benifits of not using break

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("Please enter a valid fruit");
                break;
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
