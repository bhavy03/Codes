package com.bhavya.queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}

// Queue is an interface while stack is a class
// Stack is similar to array while queue similar to linked list