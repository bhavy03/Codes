package com.bhavya;

public class PassingExample {
    public static void main(String[] args) {
        String name = "kunal";
        System.out.println(name);
        greet(name);
        System.out.println(name);
    }

//    here kunal is an object in heap memory and name is pointing towards it when name is passed
//    in method its value that value of reference variable is passed
//    there is no such thing as pass by reference it is always pass by value in java
//    and now a copy of the reference variable is going to pass to method
//    therefore the naam is same as copy of name, so it also points towards kunal now

    static void greet(String naam) {
        System.out.println(naam);
        naam = "hari";
        System.out.println(naam);
    }
}
