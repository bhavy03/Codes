package com.bhavya;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array list is a part of collection framework in which we don't know the size of array in it is java.util package
        //syntax
        ArrayList<Integer/* here can't use primitives need to use wrapper class*/> list = new ArrayList<>(10);

        //how it works internally is
        //size is fixed internally
        //say arraylist fills by some amount now
        //it will create a new arraylist of say , double the size
        //old elements are copied in new one
        //old one is deleted

        list.add(83);
        list.add(23);
        list.add(6545);
        list.add(12);
        list.add(239);
        list.add(9646);
        list.add(325);
        list.add(36422412);
        list.add(1);
        list.add(83);
        list.add(83);
        list.add(83);
        list.add(83);

        System.out.println(list.contains(923832));
        System.out.println(list);
        list.set(0, 99);
        list.remove(3);
        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //output
        //System.out.println(list);
        //or
        for (int i = 0; i < 5; i++) {  //get item at any index
            System.out.println(list.get(i));  //pass index here, list[index]syntax will not work here
        }
    }
}
