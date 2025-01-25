package com.bhavya;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//      typecasting of two types implicit and explicit
//        compressing a bigger number in smaller type explicitly
//      conditions of typecasting
//        the two types should be compatible
//        destination type(float) should be greater than the source type(int)
//        left should be greater than the right
//        narrowing conversion is the conversion of float to int


        int num = (int)(64.56f);     //or like  int num = (int)64.56f;
        System.out.println(num);     //this is explicit   (order byte->short->char->int-.long->float->double)

//        int a = 34;   //this is implicit
//        long b = a;   //order is double->float->long->int->char->short->byte

        //float num = input.nextFloat();
        //System.out.println(num);


//        automatic type promotion in expression
//        int a = 257;
//        byte b = (byte) (a);    //257 % 256 = 1
//        System.out.println(b);


//        byte c = 40;
//        byte d = 50;
//        byte e = 100;
//        int f = c * d / e;  //here c*d is more than 256 therefore java automatically transfer the bytes into int
////        here a*b is performed using int
//        System.out.println(f);


//        byte k = 50;
//        k = k * 2; //it is not correct


//        int number = 'K';
//        System.out.println(number);

//        rules for promotion
//        all the byte,char,short values are promoted to integer
//        if the operation is long,double,float then it is long,double,float
//        System.out.println(3 * 5.309433904034f);

//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = 0.1234;
//        double result = (f * b) + (i/c) - (d-s);
//        System.out.println((f * b) + " " + (i/c) + " " + (d-s));
////        float + int - double = double
//        System.out.println(result);
    }
}