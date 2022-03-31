package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Queue {
    public void runQueue(){

        Deque<Integer> thisDeque = new ArrayDeque<>();
        java.util.Queue<Integer> thisQueue = Collections.asLifoQueue(thisDeque);

        System.out.println("Queue Functions:");
        System.out.println(".add(x)\n" +
                ".peek()\n" +
                ".offer(x) return true or false if x could be added\n" +
                ".remove()\n" +
                ".poll() returns null if Queue is empty\n" +
                ".element() and .peek() return head of Queue\n")
        ;

    }
}
