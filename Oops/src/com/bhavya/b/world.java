package com.bhavya.b;


import com.bhavya.a.hello;

public class world extends hello{   //here for extending in another package we use import
    private void printmessage(){      //for overriding the method ,the method in super as well as subclass have same type i.e. public or private or super with private and sub with public
        System.out.println("world");   //similarly protected in super can be made public in sub but not private
    }

    public static void main(String[] args) {
//        hello gg = new hello();  //this works without extending as object is of parent class
        hello gg = new world();
//        world gg = new world();    //why it is also showing hello
        gg.fun();       //as private method of parent class is not visible in child class.Thus no overriding takes place
    }
}
