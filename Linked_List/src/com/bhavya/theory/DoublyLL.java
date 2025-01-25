package com.bhavya.theory;

public class DoublyLL {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertfirst(2);
        list.insertfirst(4);
        list.insertfirst(34);
        list.insertfirst(55);
        list.insertfirst(13);
        list.insertlast(23);       //insert at any index will remain same as of singly LL
        list.insertafterindex(34,44);
        list.display();
    }
    private Node head;
    private int size;
    public void insertfirst(int value) {        //insert at first index
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head!= null){
            head.prev = node;
        }
        head = node;
    }
    public void insertlast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if (head == null){
            head.prev = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public Node find(int value) {                 //to get node which is removed
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertafterindex(int after,int val){
        Node p = find(after);
        if(p == null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null){
            node.next.prev = null;
        }
    }

    public void display() {                      //to display linked list
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println("Print in reverse");
        while (last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("Start");
    }
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next,Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
// when you are doing recursioin in ll you can do two things
// first have return type as void and make changes in linked list
// second have node return type that returns the list node to change the structure