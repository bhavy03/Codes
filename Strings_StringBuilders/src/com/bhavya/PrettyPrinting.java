package com.bhavya;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 122.12342f;
        System.out.printf("formatted no is %.2f", a);
        System.out.println();
        System.out.println("Pie:" + Math.PI);
        System.out.printf("Pie:%.3f", Math.PI);
        System.out.println();
        System.out.printf("Hwllo my name is %s and I am a %s", "Bhavya", "Software Developer");

//      Placeholders list
//        %c  character
//        %d  decimal number (base 10)
//        %e  exponential floating-point number
//        %f  floating-point number
//        %i  integer (base 10)
//        %o  octal number (base 10)
//        %s  String
//        %u  unsigned decimal (integer) number
//        %x  Hexadecimal number (base 16)
//        %t  Date/time
//        %n newline
    }
}
