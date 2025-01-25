package com.bhavya.lect4;

import javax.crypto.spec.PSource;

public class main {
    static A obj = new A(34,"rahul");
//packages are of two types
//    user defined package
//    in-built package
//    in-built are of following types
//    1) lang:- contains essential stuff of java and language specific and mandatory
//       ex-int and primitive datatypes and operations,
//       and it is automatically imported
//    2)i/o:- contains input output classes
//    3)util:- contains utility classes contains data structures and stuff
//    4)applet
//    5)awt
//    6)net

//    hashcode means unique representation of an object via number it's not address it is
//    just some random value

    public static void main(String[] args) {
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Object);

//    obj1 == obj2 checks the address
//    while obj1.((equals)obj2) compares the numbers inside
    }
}
