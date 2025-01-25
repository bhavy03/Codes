package com.bhavya.lect2;

public class singleton2 {
    public static void main(String[] args) {
        singleton obj1 = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        singleton obj3 = singleton.getInstance();
        //all 3 reference variables pointing to same one object
    }
}
