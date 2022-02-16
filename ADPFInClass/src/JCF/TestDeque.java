package JCF;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

    public  static void testDeque(){
        System.out.println("Testing Deque");
        Deque<Integer> objDeque = new ArrayDeque<>();

        objDeque.add(1);
        objDeque.add(2);
        objDeque.add(3);

        System.out.println("Deque -> "+ objDeque);

        objDeque.remove();
        System.out.println("Deque after remove -> "+ objDeque);
    }
    public  static void testDequeAdv(){
        System.out.println("Testing Deque");
        Deque<Integer> objDeque = new ArrayDeque<>();

        objDeque.offer(1);
        objDeque.offer(2);
        objDeque.offer(3);

        System.out.println("Deque -> "+ objDeque);

        objDeque.remove();
        System.out.println("Deque after remove -> "+ objDeque);
        objDeque.addFirst(4);
        System.out.println(objDeque);
        objDeque.addLast(5);
        System.out.println(objDeque);
        objDeque.push(6);
        System.out.println(objDeque);
    }
}
