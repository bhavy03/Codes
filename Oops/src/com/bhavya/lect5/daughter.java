package com.bhavya.lect5;

public class daughter extends parent{
    public daughter(int age) {
        super(age);
        this.age = age;
    }
    @Override
    void career() {
        System.out.println("i am going to be coder");
    }

    @Override
    void partner() {
        System.out.println("i love him");
    }
}
