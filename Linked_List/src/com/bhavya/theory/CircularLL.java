package com.bhavya.theory;

public class CircularLL {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(32);
        list.insert(34);
        list.insert(54);
        list.insert(40);
        list.insert(23);
        list.insert(2);
        list.display();
        System.out.println();
        list.delete(34);
        list.display();
    }
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value){
        Node node = head;
        if (node == null){
            return;
        }
        if (node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);

    }

    public void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            }while (node != head);
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
