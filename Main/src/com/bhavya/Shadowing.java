package com.bhavya;

public class Shadowing {
     static int x = 90; //this will shadowed at line 10 as lower level is overriding the upper level
    // x is going to available to everything that is present in the block of x
    //we can't use object dependent things in object independent things that's why we use static over there
    //shadowing in java is basically practice of using two variables with the same name within the scope that overlap
    public static void main(String[] args) {
        System.out.println(x); //90
        int x;  //this is declaring
        //System.out.println(x); this is giving error as it is not initialized
        x = 40; //this is initializing
        System.out.println(x); //40 as it's available in this block only so it will shadow upper block x
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}
