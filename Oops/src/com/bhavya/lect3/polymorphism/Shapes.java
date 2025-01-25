package com.bhavya.lect3.polymorphism;

public class Shapes {
    void  area() {            //by putting final here we can prevent the file from getting override
        System.out.println("i am in shapes");      //we can also use final to a class name to prevent inheritance
    }

    static void greeting(){
        System.out.println("hello greetings in shapes");
    }

}
