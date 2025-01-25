package com.bhavya;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
//      println calls the valueof function which calls
//      toString function which eventually changes it to string

//      operator overloading is not supported in java

        System.out.println("a" + "b");
        System.out.println('a' + 3);

        System.out.println("a" + 3);
//      when a integer is added to string the integer
//      is converted to its Integer wrapper class that will call toString()
//      therefore this is same as "a" + "1" after few steps

        System.out.println((char) ('a' + 3));

        System.out.println("a" + new ArrayList<>());

//        System.out.println("A" + new Integer(56));

//        System.out.println(new ArrayList<>() + new Integer(56));
//        this is throwing error cause + operator can only be used with primitives
//        or with any complex object but atleast one of them should be string
//        System.out.println(new ArrayList<>() + " " + new Integer(56));
//        this will work
    }
}
