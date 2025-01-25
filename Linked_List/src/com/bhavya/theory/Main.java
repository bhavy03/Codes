package com.bhavya.theory;

public class Main {

    // in java arrays are not in continuous memory allocation
// arrays store only a limited memory and also in arraylist we double the size to store the next element which is not much helpful
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(34);    //this is how internal linked list is created
        SinglyLL list = new SinglyLL();
        list.insertfirst(5);
        list.insertfirst(2);
        list.insertfirst(9);
        list.insertfirst(7);
        list.insertlast(45);
        list.insert(525, 3);
        list.display();
        System.out.println();
        System.out.println(list.deletefirst());
        list.display();
        System.out.println();
        System.out.println(list.deletelast());
        list.display();
        System.out.println();
        System.out.println(list.delete(2));
        list.display();
        System.out.println();
        System.out.println(list.find(2));
        list.display();
    }
}
