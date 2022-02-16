package JCF;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueue<I>{
    private ArrayList<I> queue = new ArrayList<>();



    public I element(){
        if (queue.size() == 0){
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }
    public I remove(){
        if (queue.size() == 0){
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }
    public I peek(){
        if (queue.size() == 0){
            return null;
        }
        return queue.get(0);
    }



}
