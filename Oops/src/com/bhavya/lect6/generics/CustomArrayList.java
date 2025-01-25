package com.bhavya.lect6.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
//        here we are creating our own custom arraylist
        private int[] data;          //here we are creating an array to store data
//    now here the main problem is we are only capable of storing integers only but
//    internal arraylist provides us the facility to store other datatypes and this property is generics
//    generics helps us to provide parametrized types
//    it also provides type safety
        private static int DEFAULT_SIZE = 10;   //here the default size of arraylist is 10
        private int size = 0;   //here the initial size is 0    //also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
        //copy the current items in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index] = value;
    }

    public static void main(String[] args) {
//        how arraylist works
//           suppose we have arraylist of size 10 and if we try to insert 11th element it creates an
//           array of double size and puts previous data in that and also new one
//           now this doubling occurs at constant time on an average
//        ArrayList list = new ArrayList();    //this arraylist is already in java
//        list.add(23);
//        list.remove(0);
//        list.get(0);
//        list.set(1,343);
//        list.size();
//        list.isEmpty();

        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(55);

        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }

        System.out.println(list);
    }
}



