package JCF;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

    public static void testPriorityQueue(){
        System.out.println("Testing Priority Queue");

        Queue<Integer> objQueue = new PriorityQueue<>();

        objQueue.add(1);
        objQueue.add(2);
        objQueue.add(3);

        System.out.println("PQueue -> " + objQueue);

        System.out.println("PQueue Head -> "+ objQueue.element());

        objQueue.remove();

        System.out.println("PQueue Head Gone -> "+ objQueue);

        System.out.println("PQueue Size -> "+ objQueue.size());




    }
    public static void testPriorityQueueAdv(){
        System.out.println("Testing Priority Queue Advanced");

        Queue<Integer> objQueue = new PriorityQueue<>();

        objQueue.offer(1);
        objQueue.offer(2);
        objQueue.offer(3);

        System.out.println("PQueue -> " + objQueue);

        System.out.println("PQueue Head -> "+ objQueue.element());

        objQueue.offer(4);
        System.out.println("PQueue -> " +objQueue);

        System.out.println("PQueue Head Peek -> "+ objQueue.peek());
        System.out.println("PQueue Head Poll -> "+ objQueue.poll());
        System.out.println(objQueue);

        System.out.println("PQueue Size -> "+ objQueue.size());




    }


}
