package com.bhavya;

public class Array {
    public static void main(String[] args) {
        // array is the collection of datatypes whether it is primitive,objects.

        // syntax
        //datatype[] variable_name = new datatype[size];  here [] indicates array

        // store 5 roll nos
        int[] rollno = new int[5];  // here int represents what type of data is stored in array
        //or directly               // you can't put string in between integers that is can't mix datatypes
        int[] rolno = {232, 32, 4, 24, 34};

        int[] rons;        //declaration of array,rons is getting defined in the stack
        rons = new int[5];  //intialization : actually object is being created in the memory (heap)

        // int[] arr: happens at compile time and new int [5] : happens at run time(dynamic memory allocation)
        // array objects are in heap
        // objects are not continuous
        // DMA and hence in java internally it may not be continuous as it depends on JVM
        // index of array is like position of array
        // new is used to create an object

        System.out.println(rons[0]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
        //null is a special literal that is only assign to non-primitive not to primitive
        //null is not a object or a datatype it is a special type of which can be assigned to any reference type and can type cast null to any other variable
        //primitives are stored in stack memory like int,char and string,array are stored in heap memory
        //if each element of array is object then it is allocated somewhere else and the element is reference variable
        //and for every reference variable if there is no value then it is null
    }
}