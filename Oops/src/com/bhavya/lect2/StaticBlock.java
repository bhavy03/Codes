package com.bhavya.lect2;

//this is a demo to show initialization of static variables
public class StaticBlock {      //when the class loads first all the static members will run here first int a then static block and static block run once only
    static int a = 12;
    static int b;

    static {               // static block gets executed exactly once when the class is loaded
        System.out.println("i am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(obj.a + "  " + obj.b);
//        System.out.println(StaticBlock.a);

        StaticBlock.b += 3;
        System.out.println(obj.a + "  " + obj.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(obj2.a + "  " + obj2.b);
    }
}
