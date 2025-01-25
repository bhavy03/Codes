package com.bhavya.lect1;

public class WrapperExample {
    public static void main(String[] args) {

        int a = 13;
//      Integer num = new Integer(23);
//        or
        Integer num = 34;
//        here Integer is a wrapper class as here num has been created as an object
//        wrapper classes are like converting primitives or characters to objects
//        as we write a. very fewer options come
//        but if we write num. more options come
//        automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing ex:-char ch = 'a'   Character a = ch;
//        automatic conversion of object of a wrapper classes to it's corresponding primitive types is known as unboxing ex:- Character a = ch;     char ch = 'a'


//        final is a keyword that prevents the content to be modified like constant
//        final int INCREASE = 122;  while using final keyword make sure to use capital letter
//        always initialize the final while declaring
//        this immutability of not changing the values holds for primitive datatypes
//        example
//        final student kunal = new student("kunal");
//        kunal.name = "bhavya";   this is allowed

//        when a non primitive is final you can't reassign it
//        kunal = new student("hari")

//        we use destructors in C++ but here automatic garbage collection occurs
//        with the help of garbage collectors we can't delete it manually
//        we have a keyword finalize to show a message when an object is destroyed
//        two objects can't point to same reference variable
//        example
//        student obj;
//        for (int i = 0; i < 10000000; i++) {
//            obj = new student("kunal");
//        }
//        so every time a new object has been created with same variable and the old ones
//        get deleted by garbage collector
    }
}
