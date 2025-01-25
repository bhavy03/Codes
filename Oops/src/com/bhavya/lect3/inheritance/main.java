package com.bhavya.lect3.inheritance;

import com.bhavya.lect3.inheritance.Box;
import com.bhavya.lect3.inheritance.Boxprice;
import com.bhavya.lect3.inheritance.Boxweight;

public class main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box2 = new Box(box1);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);

//        Boxweight box3 = new Boxweight();        //base class object can't use child class properties
//        Boxweight box4 = new Boxweight(44,43,54,65);
//        Boxweight boxx = new Boxweight(box3);
//        System.out.println(box4.h + " " + box4.weight);
//        System.out.println(boxx.weight);

//        Box box5 = new Boxweight(23,45,454,5);      //it is a reference to box and it is referencing to the type of boxweight
//        System.out.println(box5.w);
        //here what happens is we can initialize any child object but access a few variables only
        //System.out.println(box5.w /* but we can't access box5.weight*/);    //we can only initialize it
        //now here what happens the type of reference variable determines what members can be accessed not the type of object
        //the parent is pointing to the child's object
        //the reference variable box5 in stack memory points to the object boxweight in heap memory

//        Boxweight box6 = new Box(23,54,64); //can't have child variable pointing to parent object
//        System.out.println(box6.h);         //this didn't work because

//        there are many variables in both parent and child class
//        so we are given access to variables that are in ref type i.e. boxweight
//        hence we should have access to weight variable
//        this also means the ones we are trying to access must be initialized
//        but here the object itself is of parent class ,how will you call the constructor of child class
//        means we are unable to access and initialize weight variable even though we have object of boxweight

//        Boxprice box7 = new Boxprice(5,5,45);
//        Boxprice box8 = new Boxprice(box7);
//        System.out.println(box7.cost);

    }
}
