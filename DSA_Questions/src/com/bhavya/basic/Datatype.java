package com.bhavya.basic;

import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String letter = in.next();
        switch (letter){
            case "Integer" -> System.out.println("4");
            case "Long" -> System.out.println("8");
            case "Float" -> System.out.println("4");
            case "Double" -> System.out.println("8");
            case "Character" -> System.out.println("1");
            default -> System.out.println("enter valid");
            }
    }
}
