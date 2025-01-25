package com.bhavya;

import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        string.append("t");
        string.append("t");
        string.append("t");
        string.append("t");
        string.append("t");
        System.out.println("hello"+ string.lastIndexOf("t"));
        System.out.println(builder.toString());
        System.out.println(string.reverse());

//      here the string is mutable
        builder.deleteCharAt(0);
        System.out.println(builder);


//      here the string is immutabel
        String name = "Bhavya SONI";
        System.out.println(Arrays.toString(name.toCharArray()));  // here new object is formed
        System.out.println(name.toLowerCase());   // new object is formed
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("    bhavay a  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
