package com.bhavya.lect5;

public class son extends parent{   //here son must overrides all the abstract methods

    public son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();   //we can also override it
    }

    @Override
    void career() {
        System.out.println("i am going to a doctor");
    }

    @Override
    void partner() {
        System.out.println("i love her");
    }
}
