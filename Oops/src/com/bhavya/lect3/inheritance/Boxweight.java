package com.bhavya.lect3.inheritance;

public class Boxweight extends Box {
    double weight;

    public Boxweight(){
//        super();
        this.weight = -1;
    }

    public Boxweight(double l,double h,double w,double weight){   //here super gets initialize first then this.weight because parent doesn't care about child class
        //if we don't use super default constructor will be called
        super(l,h,w);        //call the parent class constructor
        //it is used to initialize the values present in parent class constructor which calls the constructor with 3 arguments
        //if we use super keyword in super class then it will not give an error because every class is subclass of class object which inherits it's properties
//        System.out.println(super.w/* or this.w */);   //but we use super because if both super and subclass have same variable and we want super class variable
        this.weight = weight;

    }

    Boxweight(Boxweight other){
        super(other);
//        super(other.h, other.l, other.w);  //this calls l,h,w
        this.weight = other.weight;
    }

    Boxweight(double side ,double weight){
        super(side);
        this.weight = weight;


    }
}

