package com.bhavya.lect3.polymorphism;

public class Square extends Shapes{
    @Override     //it is only an annotation to check whether a method is overridden or not
    void area() {     //it is overriding parent class method when object of square is created and it is given more priority
        System.out.println("i am in square");
    }
}
