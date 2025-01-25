package com.bhavya.lect2;

public class InnerClass {     //outer classes can't be static only inner classes
    static class Test{       //static stuff gets resolved during the compile time
          String name;     //if we put static here when the test class is out of the innerclass class then the outputs will be both rahul
          public Test(String name){
              this.name = name;
          }
    }

    public static void main(String[] args) {
//        Test a = new Test("kunal");       //it is showing error because the class test is dependent on outer class that is innerclass
//        Test b = new Test("bhavya");      //and the object is not of test class but if we put it outside the test class outside innerclass it will work

//        if no static then this
//        Outer obj1 = new Outer();
//        Creating an instance of inner class inside main()
//        Outer.Inner obj2 = obj1.new Inner();

        Test a = new Test("kunal");   //here it works as by using static before class test it now doesn't depend on objects of outer class
        Test b = new Test("bhavya");  //here it gives kunal and rahul because here test and innerclass can share the instances

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
