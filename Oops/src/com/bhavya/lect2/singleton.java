package com.bhavya.lect2;

public class singleton {   //singleton class is a class which has only one object and we do it by making the constructor private
    private singleton(){

    }

    private static singleton instance;

    public static singleton getInstance(){
        //check whether one object is created or not
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }

}
