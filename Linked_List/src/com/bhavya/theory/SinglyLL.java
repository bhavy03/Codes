package com.bhavya.theory;

public class SinglyLL {

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertfirst(5);
        list.insertfirst(5);
        list.insertfirst(5);
        list.insertfirst(2);
        list.insertfirst(2);
        list.insertfirst(2);
        list.insertfirst(9);
        list.insertfirst(7);
        list.insertlast(45);
        list.insert(525, 3);

        list.insertRec(88, 2);
        list.display();
        System.out.println();

        list.RemoveDuplicates();
        list.display();
        System.out.println();

        SinglyLL first = new SinglyLL();
        SinglyLL second = new SinglyLL();
        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);
        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);
        SinglyLL ans = SinglyLL.merge(first, second);
        ans.display();
    }

    private Node head;
    private Node tail;
    private int size;

    public SinglyLL() {
        this.size = 0;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void insertfirst(int value) {        //insert at first index
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public int deletefirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public void insertlast(int value) {      //insert at last index and if not tail use while
        if (tail == null) {
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deletelast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secondlast = get(size - 2);
        int value = tail.value;
        tail = secondlast;
        tail.next = null;
        return value;
    }

    public void insert(int value, int index) {    //insert at any index
        if (index == 0) {
            insertfirst(value);
            return;
        }
        if (index == size) {
            insertlast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int delete(int index) {
        if (index == 0) {
            return deletefirst();
        }
        if (index == size - 1) {
            return deletelast();
        }
        Node previous = get(index - 1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        return value;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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

    public void display() {                      //to display linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node {
        private int value;
        private Node next;
//      here type of next is Node cause the type of object of class Node is node
//      as next is a reference variable pointing to another node of type Node
//      therefore we take the type of next as Node

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //    Questions
//    1. Remove duplicates from a linked list.
    public void RemoveDuplicates() {
        Node node = head;
//        if(node == null){
//            return node;
//        }
//        Listnode head = node;
//        return head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //    2. Merge two sorted linked lists
    public static SinglyLL merge(SinglyLL first, SinglyLL second) {
        Node f = first.head;
        Node s = second.head;

        SinglyLL ans = new SinglyLL();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertlast(f.value);
                f = f.next;
            } else {
                ans.insertlast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertlast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertlast(s.value);
            s = s.next;
        }
        return ans;
    }

//    3.check if it has a cycle or not
//    public static boolean hascycle(ListNode head){
//        Listnode fast = head;
//        Listnode slow = head;
//        while(fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                return true;
//            }
//        }
//        return false;
//    }

    //    to find length of cycle
//    public static int cycleLength(ListNode head) {
//        Listnode fast = head;
//        Listnode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                ListNode temp = slow;
//                int length = 0;
//                do{
//                    temp = temp.next;
//                    length++;
//                }while(temp != slow);
//                return length;
//            }
//        }
//        return 0;
//    }
}
