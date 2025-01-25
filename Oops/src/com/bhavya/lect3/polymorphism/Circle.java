package com.bhavya.lect3.polymorphism;

public class Circle extends Shapes{
    @Override     //here it is getting overridden
    void area(){
        System.out.println("ia am in circle");
    }

//        @Override    //now here it is not getting override
     static void greeting(){
        System.out.println("hello greetings in circle");
    }
}
