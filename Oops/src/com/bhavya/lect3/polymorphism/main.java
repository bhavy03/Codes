package com.bhavya.lect3.polymorphism;

public class main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();
//        Circle circle = new Circle();
//        circle.area();
//        Square square = new Square();
        Shapes squaress = new Square();  //it will throw error if method area is removed from shapes class
//       here the object type decides which one to run and reference type decides which it can access
//       if method overriding is occurring then parent can access the beta's methods
        squaress.area();

        Square squareed = new Square();
        squareed.area();

//        Circle circles = new Circle();
//        circles.greeting();  //defining a static method with same signature as a static method in base class is method hiding

//        Shapes.greeting();   //here it doesn't get override static methods doesn't depend through which object you are calling
//        as overriding depends on objects and static doesn't depend on objects therefore static can't be overridden
//        in polymorphism both overloading and overriding doesn't apply to instance variables

        Shapes circle = new Circle();
        circle.greeting();   //this will show shape's greeting
        // To summarize, static methods cannot be overridden in Java. They can only be hidden or shadowed by subclasses with their own separate static methods.
        // The choice of which static method to call is determined by the type of the reference variable or the class itself,
        // rather than the actual object being referred to.
//        Circle circle = new Square();    //ain't gonna work
//        Circle circle = new Circle();
//        circle.greeting();   //this will show circle's greeting
    }
}
