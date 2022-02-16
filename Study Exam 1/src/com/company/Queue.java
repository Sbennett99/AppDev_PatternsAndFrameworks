package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Queue {
    public static void runQueue(){

        Deque<Integer> thisDeque = new ArrayDeque<>();
        java.util.Queue<Integer> thisQueue = Collections.asLifoQueue(thisDeque);

        System.out.println("Queue Functions:");
        System.out.println(".add(x)" +
                ".peek()" +
                ".offer(x) return true or false if x could be added" +
                ".remove()" +
                ".poll() returns null if Queue is empty" +
                ".element() and .peek() return head of Queue")
        ;

    }
}
