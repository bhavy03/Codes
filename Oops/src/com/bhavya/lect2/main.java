package com.bhavya.lect2;

public class main {
    public static void main(String[] args) {
        Human kunal = new Human(32,"bhavya",12929,true);
        System.out.println(Human.population);
        Human rahul = new Human(13,"krishna",341434,false);
        System.out.println(kunal.name);

        System.out.println(Human.population);

        main ob = new main();
        ob.fun2();
//        greeting();
//        fun();
    }


//    static void greeting(){      //we use static here because we can't use non-static thing into static method
                                 //therefore static member access only static data
                                 //because we know something which is not static belongs to object
                                 //same thing can't be done with static method in which we call another non-static method
                                 //use static variable for the property which is common to all subjects
                                 //we can use or call static method in a non-static method
//        System.out.println("hello world");
//    }
    static void fun() {
//        greeting();   //we can't use this
        main obj = new main();       //but we can by this way
        obj.greeting();              //therefore we can't access non-static stuff without referencing their instances to a static context
    }

    void fun2(){           //here what happens fun2 takes care of creating the object
        greeting();
    }
    void greeting(){        //we can access this as in the end everything goes to main and finally object will be created
//        fun();            //we can use fun here
        System.out.println("hello world");
    }         //we can't use this keyword in static method
}
