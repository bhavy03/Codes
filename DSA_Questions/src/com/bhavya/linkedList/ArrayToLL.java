package com.bhavya.linkedList;

public class ArrayToLL {
    public static void main(String[] args) {
        int[] arr = {1,5,3,5,4,1,3};
        ArrayToLL list = new ArrayToLL();
        list.add(arr);
        list.display();
    }

    public Node head;
    public int size;

    public ArrayToLL() {
        this.size = 0;
    }

    public void add(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            insert(arr[i]);
            size++;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+" " + "--> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

//    static Node constructLL(int arr[]) {
//        // code here
//        if(arr.length==0){
//            return null;
//        }
//        Node head=new Node(arr[0]);
//        Node current=head;
//        for(int i=1;i<arr.length;i++){
//            current.next=new Node(arr[i]);
//            current=current.next;
//        }
//        return head;
//    }
