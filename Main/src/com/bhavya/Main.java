package com.bhavya;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner in = new Scanner(System.in);
//        static variables are the variables which do not depend on the object of the variable class like population of world is same for everyone
//              ctrl+E for recent files
//              ctrl+B for going to declaration
//              alt+F7 for all the places something is used
//              double tap ctrl to run anything
//              ctrl+W for extend or shrink selection
//              shift+ctrl enter for completing current statement
//              alt+ctrl+L to reformat file
//              shift+ctrl+alt+T to refactor files
//              ctrl+shift+A for all shortcuts
//              double shift to search anywhere
//              ctrl+, for new class
//              Alt+shift+up to move line up
//              ctrl+; for run
//              ctrl+D to duplicate line
//              ctrl+y to delete line
//              ctrl+shift+v to paste the text copied on clipboard
        System.out.print("please enter some input: ");
        int rollno = in.nextInt();
        System.out.println("Your roll no is " + rollno);
    }
}