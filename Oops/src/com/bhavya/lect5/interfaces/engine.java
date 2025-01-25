package com.bhavya.lect5.interfaces;

public interface engine {

    int price = 12342343;  //it is by default static and final

    void start();
    void stop();
    void acc();
//  interface is not class
//  it is used to achieve abstraction and multiple inheritance in java
//  interfaces specify what a class must do and not how
//  it is the blueprint of behaviour
//  if a class implements an interface and doesn't provide method bodies for all function specified in interface,then the class must be declared abstract
//  any class extends only 1 class any class can implement infinite number of interfaces
//  interface basically contains abstract function
//  by default methods in interfaces are abstract and public
//  and variables are public,static and final
//  final because in interface we can't create constructor so we can't initialize it
//  abstract class class can provide the implementation of interface
//  but interface can't provide the implementation of abstract class
//  a class can implements more than one interfaces but can inherit only one class
//  for more function to be available to child class function get pushed to higher and higher classes
//  interfaces disconnect the definition of the method from this hierarchy of inheritance
//  two classes which are unrelated can have same interface
//    if interface B extends interface A then while implementing interface B in main we have to override
//    all the methods in both the interfaces in main
//  java will show compilation error when a java class implement two interfaces with same methods having the same signature but return types
    
}
