package com.bhavya;

public class Scoping {
    public static void main(String[] args) {
        //scope
        // function scope means you can't access a variable outside it's function
        int a = 23;  //
        int b = 24;
        String name = "kunal";
        {
            //anything initialized outside the block can be used or updated inside the block but can't be initialized again inside the box and
            // if anything initialized inside the block can't be used outside but can be initialized outside the box
            // can't do this int a = 34  already initialized outside the block in the same method,hence you can't initialize again
            a = 29; //reassign the original ref variable to some other value
            int c = 22;
            name = "rahul";
            //values intialized in this block will remain in block
            System.out.println(a);
            // if something is initialize in this block you can use this in this block only and for using it outside initialize it outside first
            //and if something is initialized outside you can use it or modify it in block
        }
        int c = 939;
        System.out.println(a);
        System.out.println(name);
        System.out.println(c);   //can't use outside the block
    }
}
