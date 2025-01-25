package com.bhavya;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        primitives are stored in stack memory while objects are stored in heap memory

//        String a = "kunal";
//        a pointing to kunal
//        System.out.println(a);

//        String b = "kunal";
//        b also pointing to kunal
//        System.out.println(b);

//        System.out.println(a==b);

//        a = "baba";
//        new object created where a pointing to kunal
//        a= "dada";

//        b=a;
//        here b pointing to a
//        System.out.println(b==a);
//        System.out.println(a + " " + b);

//      creating string objects outside the string pool
        String name1 = new String("kunal");
        String name2 = new String("kunal");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));  //this cares only about value
        System.out.println(name1.charAt(0));      //not name1[0]

//        int a = 4;
//        int b = a;
//        a = 5;
//        System.out.println(a);
//        System.out.println(b);
//
//        int[] arr1 = {2, 3, 4, 5, 6};
//        int[] arr2 = arr1;
//        arr1[1] = 8;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//
//        String naam1 = "Kunal";
//        String naam2 = naam1;
//        naam1 = "Bhavya";
//        System.out.println(naam1);
//        System.out.println(naam2);

//        System.out.println(new int[]{2, 3, 4, 5, 6});
//        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5, 6}));

//        System.out.println(56);
//        Integer num = new Integer(56);
//        System.out.println(num.toString());
    }
}
