package com.bhavya.lect6.generics;

import java.util.Arrays;
import java.util.List;

public class CustomGenericArraylist<T> {   //here in T if we wanted to access only few datatypes then we write it as public class CustomGenericArraylist<T extends Number>
                                           //as Number class have int and float but not String
                                           //so T can access Number and it's subclasses so these are wild cards
        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0;

        public void getlist(List<Number> list /* we access here only number class not it's subclasses for that we can write List<? extends number>*/){
            //do something
        }
        public CustomGenericArraylist() {
            this.data = new Object[DEFAULT_SIZE];   //we are unable to use new T[] here as at compile time we don't know it's type and at runtime it can't determine
        }                                      //can't instantiate generic types with primitive types
                                               //can't create instances of type parameter
                                               //can't declare static fields whose types are type parameter
        public void add(T num){
            if (isfull()) {
                resize();
            }
            data[size++] = num;
        }

        private void resize() {
            Object[] temp = new Object[data.length*2];
            //copy the current items in new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        private boolean isfull() {
            return size == data.length;
        }

        public T remove(){
            T removed = (T) data[--size];
            return removed;
        }

        public T get(int index){
            return (T) data[index];
        }


        public int size(){
            return size;
        }

        public void set(int index,int value){
            data[index] = value;
        }

        @Override
        public String toString() {
            return "CustomArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        public static void main(String[] args) {
        CustomGenericArraylist<Integer> list3 = new CustomGenericArraylist<>();

            list3.add(45);
            for (int i = 0; i < 14; i++) {
                list3.add(2*i);
            }
            System.out.println(list3);
        }
}