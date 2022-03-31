package JCF.Assign5;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Walmart {

    private Double total;
    private int count;
    ReentrantLock lock;
    Condition c;
    private ReentrantLock innerLock;
    private Condition innerC;

    Walmart(){
        total = 0.0;
        count = 0;
        lock = new ReentrantLock();
        c = lock.newCondition();
        innerLock = new ReentrantLock();
        innerC = innerLock.newCondition();
    }

    public void totalPrice(ArrayList<String> names,ArrayList<Double> prices){
        innerLock.lock();
        try {

            Double newTotal = 0.0;
            for (Double price : prices) {
                newTotal += price;
                setTotal(newTotal);
                countUP();
            }
            lock.lock();
            try {


                System.out.println("Item Num: " + names.size());
                System.out.println("Count : " + count);
                System.out.println("NewTotal: " + newTotal);
                System.out.println("Total: " + total);
                System.out.println();
            }finally {
                lock.unlock();
                reset();
            }
        }finally {
            innerLock.unlock();
        }
    }

    private void countUP(){
        count++;
    }
    private void resetCount(){
        count = 0;
    }
    public void reset(){
        setTotal(0.0);
        resetCount();
    }

    private void setTotal(Double num){
        total = num;
    }
}
