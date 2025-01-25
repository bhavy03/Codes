package com.bhavya;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

        //swap numbers code
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

//        for String

        String name = "Kunal kushwaha";
        changename(name);
        System.out.println(name);

    }

    static void swap(int a, int b) {  //also use num1 and num2 instead of a and b
        int temp = a;
        a = b;
        b = temp;
    }

    //    similarly
    static void changename(String naam) {  //at this moment both points towards kunal
        naam = "Rahul rana";    //here naam points to rahul
//        name = "Rahul rana";
//        System.out.println(name);
    }
//    here kunal is an object in heap memory and name is pointing towards it when name is passed
//    in method calling its value that value of reference variable is passed
//    there is no such thing as pass by reference it is always by value in java
//    and now a copy of the reference variable is going to pass to calling method
//    therefore the naam is same as copy of name ,so it also points towards kunal
//    now here naam now points towards rahul but name still points towards kunal
//    therefore kunal is going to print
//    we can't use naam outside of changename method it is known as scoping
//    primitives : int,short,char,byte  are just pass by value
//    while objects and stuff are passing by value

}