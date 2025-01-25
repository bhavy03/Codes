package com.bhavya.lect5.extendDemo;

public interface A {
//    the main aim of interfaces is to achieve abstraction and it can use methods with final,static,public by default i.e one can use method body with
//    default.
    default void fun(){     //primary motivation for this default method is to provide a means through which interfaces can be expanded
        System.out.println("i am in A");  //without breaking the existing code
    };                                    //it is used as if we have to provide a method without body in interface then we have to provide the body in all
                                          //the classes that implements that interface so to overcome it we use default
}

//java program to demonstrate multiple inheritance through default method
//interface test1{
//    default void show(){
//        System.out.println("default test1");
//    }
//}
//
//interface test2{
//    default void show(){
//        System.out.println("default test2");
//    }
//}
//
//class test implements test1,test2{
//
//    @Override
//    public void show() {
//        test1.super.show();
//        test2.super.show();
//    }
//
//    public static void main(String[] args) {
//        test d = new test();
//        d.show();
//    }
//}