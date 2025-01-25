package com.bhavya.a;

public class hello {
    private void printmessage()         //we can access this private member by simply creating object of it
    {
        System.out.println("hello");    //default can't also be overridden as it's limited to it's package only
    }
    public void fun(){           //overriding not possible with private methods
        printmessage();
    }
}

//private members of outer class can be accessed by inner class
//class outer{
//    private String msg = "gfg";
//    private void fun() {                         //fun() not overridden because private methods are bonded to compile time and it is the type of
//        System.out.println("outer fun()");       //reference variable not the type of object it refers to that determines what method to be called
//    }
//
//    class inner extends outer{
//        private void fun(){
//            System.out.println("accessing private member of outer " + msg);
//        }
//    }
//
//    public static void main(String[] args) {
//        outer o = new outer();
//        inner i = o.new inner();
//
//        i.fun();
//        o.fun();
//    }
//}


//we can call parent class method in overriding method using super keyword
//class parent{
//    void show(){
//        System.out.println("parent");
//    }
//}
//class chlid extends parent{
//    @Override
//    void show() {
//        super.show();
//        System.out.println("child");
//    }
//}
//
//class main{
//    public static void main(String[] args) {
//        parent obj = new chlid();
//        obj.show();
//    }
//}

