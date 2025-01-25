package com.bhavya.lect1;

public class Main {
    public static void main(String[] args) {

//class is a named group of properties and function
//class doesn't have a memory, so they create an instance known as object
//class is a logical construct while object is a physical reality occupying space
//objects are categorized i.e. they have 3 essential properties
//new dynamically allocates the memory(that is allocates it at the run time ) and returns a reference variable to it
        // state of the object      - It's value from it's datatype
        // identity of the object  - when one object is different from another
        // behaviour of the object  -
//we don't use new keyword for creating primitive datatypes because they are not objects, so they didn't store in heap memory rather than they get stored in stack memory

//        student[] students = new student[];
//        System.out.println(Arrays.toString(students));
//        this will give an array of null elements

//        System.out.println(kunal);    //gives a random value

//        student kunal;
//        kunal = new student();
              // or
        student kunal = new student(13,"hari",134);
// here student() is a by default constructor as that time we don't create a constructor at that time of student
// a constructor basically decides what happens when an object is created
//constructor is a special function that runs when you create an object, and it allocates some variable
//constructor have no return type
        student rahul = new student(12, "ram", 23);
        student random = new student(kunal);
        student random2 = new student();
        student one = new student();
        student two = one;

        one.name = "something something";    //this overrides the student() constructor
//        kunal.rollno= 34;
//        kunal.marks = 45;
//        kunal.name = "bhavya";

        System.out.println(kunal.rollno);  //if a value is not assigned than the default value is 0.0
        System.out.println(kunal.marks);   //if a value is not assigned than the default value is 0
        System.out.println(kunal.name);    //if a value is not assigned than the default value is null
        System.out.println(random.name);
        System.out.println(random2.name);
        System.out.println("here" + two.name);

//        kunal.changename("hari");
//        kunal.greeting();
    }

    public static void greeting() {
        System.out.println("hello my name is genius" /*+ name*/ /* we can also use this.name here */);
    }
}



//create a class
class student {
    int rollno = 4;
    String name;
    float marks = 44;


//    public static void greeting() {
//        System.out.println("hello my name is " /*+ name*/ /* we can also use this.name here */);
//    }

    //    void changename(String newname  // if we write name instead of newname) {
//        name = newname;                 //then it is written as this.name = name;
//    }
//
//    we need a way to add the values of the above properties object by object
//    we need one word to access every object
//    here this means it is going to replace by the object i.e. it is a reference variable that refers to the current object
//    student() {
//        this.rollno = 13;
//        this.marks = 353;
//        this.name = "bhavya";
//    }
//                    or

//    student() {
//        rollno = 13;
//        marks = 353;
//        name = "bhavya";
//    }
    student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }
//                 or

//    student(int rol, String nam , float mark){
//        rollno = rol;
//        marks = mark;
//        name = nam;
//    }

    student (student other){
        this.name = other.name;
        this.marks = other.marks;
        this.rollno = other.rollno;
    }

    student() {
        //this is how you call a constructor with another constructor
        //internally: new student(32,"default person",100)
        this(32,"default person",100);
    }

}

// can't use super.super.method to access the grandparent
// final methods can be overridden CE
// if different return type in method overriding then CE
// in method overriding child access modifier can't be more restricted than parent access modifier.
// we can't override private methods.
// Private methods are final.
// a class can be made abstract without using any abstract method
// abstract classes can't have instance variables with abstract modifier.
// if something is not initialized on declared than the default value is 0
// int a = 20; int b = 30;
// public void new(int a,int b){
// this.a+this.b
// }
// new(44,55)  gives 50 as this refers to the class variables
// if innerclass is static then rather access the innerclass directly as it is static or
// outer.inner obj = new outer.inner();