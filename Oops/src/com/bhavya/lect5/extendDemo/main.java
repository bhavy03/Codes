package com.bhavya.lect5.extendDemo;

public class main implements A,B{

//    @Override
//    public void fun() {   //it is not giving any error because default is present there
//    }

    @Override        //when we override a method it's access modifier must be same either better than that not restricted than that
    public void greet() {
        System.out.println("here is the greet");
    }

    public static void main(String[] args) {
        main obj = new main();
        obj.fun();
        B.greeting();
    }
}
