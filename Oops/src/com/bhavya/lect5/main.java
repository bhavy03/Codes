package com.bhavya.lect5;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        son son = new son(34);
        son.career();
        son.normal();
//
//        daughter daughter = new daughter(45);
        parent daughter = new daughter(33);    //can also use it like this
        daughter.career();
//        if method overriding is occurring then parent can access the beta's methods

//        parent mom = new parent();  //we can't create objects of an abstract class
        parent.hello();

    }
}
