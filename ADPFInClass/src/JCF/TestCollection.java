package JCF;

import java.util.*;

public class TestCollection {
    public void testCollection(){
        List<Integer> thisL = new ArrayList<>();

        thisL.add(3);
        thisL.add(5);
        thisL.add(1);

        System.out.println("List After Adding Nums: "+ thisL);

        Collections.addAll(thisL, 11, 9);
        System.out.println("List After Collections Add All: "+ thisL);

        Collections.reverse(thisL);
        System.out.println("Reverse Items: "+ thisL);

        Collections.sort(thisL);
        System.out.println("Sort Items: "+ thisL);

        List<Integer> thisL2 = new ArrayList<>();
        Collections.addAll(thisL2,3,5,1,9,11,12);

        System.out.println("Here is a Second List: "+thisL2);

        Collections.copy(thisL2,thisL);
        System.out.println("Copied List using Collections copy: "+thisL2);

        // Deque to Queue
        Deque<Integer> thisDeque = new ArrayDeque<>();
        thisDeque.add(1);
        thisDeque.add(3);
        thisDeque.add(5);
        System.out.println(thisDeque);
        System.out.println("Collections Max on Deque: "+Collections.max(thisDeque));

        Queue<Integer> thisQueue = Collections.asLifoQueue(thisDeque);
        System.out.println("Changed into Queue: "+ thisQueue);
        System.out.println("Peek Queue: "+thisQueue.peek());






    }
    public void testCollectionADV(){

        List<Integer> thisL = new ArrayList<>();

        thisL.add(5);
        thisL.add(3);
        thisL.add(1);

        System.out.println("List After Adding Nums: "+ thisL);
    }
}
