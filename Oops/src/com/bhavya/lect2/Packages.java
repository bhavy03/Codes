package com.bhavya.lect2;

import static com.bhavya.lect1.Main.greeting;

//import static com.bhavya.lect2.main.greeting;

public class Packages {
    public static void main(String[] args) {
//        packages are like containers or boxes for classes
//        it's used to keep class names in compartment
        greeting();    //this is done with different packages
                       //like between com.bhavya.lect1 and other as com.bhavya.lect2
                       //but as in different packages we only import which are public
                       //in same package we didn't use import
        main ss = new main();    //instead we do this
        ss.greeting();

//        for importing a certain class use import package.name.classname
//        for importing whole package import package.name.*
    }
}
