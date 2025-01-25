package com.bhavya.lect5;

public abstract class parent {
    int age;

    public parent(int age) {  //we can add constructor in an abstract class as we access
        this.age = age;       //it via child class
    }
//    we can't have final abstract class
//    we also can't create abstract constructor like abstract parent
//    we also can't create abstract static methods as static methods can't be overridden
//    while abstract methods are meant to be overridden,
//    but we can create static methods in parent class
    static void hello(){
        System.out.println("hello");
    }

    void normal(){
        System.out.println("this is normal method");
    }
    abstract void career();
    abstract void partner();
}
