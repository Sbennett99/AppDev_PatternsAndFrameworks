package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Deque {

    public void runDeque(){

        java.util.Deque<Integer> thisDeque = new ArrayDeque<>();
        Map<Integer,String> map = new HashMap<>();

        System.out.println("Deque Functions:");
        System.out.println(".add(x)\n" +
                ".addFirst(x),.addLast(x)\n" +
                ".offerFirst(x),.offerLast(x) return true or false if item not addable to list\n" +
                ".removeFirst(),.removeLast()\n" +
                ".pollFirst(),.pollLast() return null if Deque empty\n" +
                ".getFirst(),.getLast()\n" +
                ".peekFirst(),.peekLast()\n" +
                ".pop(),.push(x) remove/add from/to the beginning of the Deque\n")
        ;

    }
}
