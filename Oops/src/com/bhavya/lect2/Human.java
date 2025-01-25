package com.bhavya.lect2;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age,String name, int salary,boolean married){
        this.age = age;
        this.name = name;
        this.married = married;
        this.salary = salary;
        Human.population += 1;    //also this.population += 1; but we don't use this type of convention
//        static variables and methods are those which are independent of the objects i.e. their value remains same for every object like population
//        now we can use this.population also but how it works is it checks first that does kunal have population no because it is static therefore
//        we check it in class and in class it is present, so it get modified
//        when a member is declared static it can be accessed before any of the object of the class is being created and without referencing to that object
//        we can still use it if no object is created
//        we use main as the very first of the program to run and without it, we can't run anything but how do we produce a output without creating objects
//        of a class which is the very first to run so we put static there, therefore static belong to class not to object
    }
}
