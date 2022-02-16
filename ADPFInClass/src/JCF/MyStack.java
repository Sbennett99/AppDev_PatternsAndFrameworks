package JCF;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyStack<I> {
    private ArrayList<I> stack = new ArrayList<>();

    public void push(I val){
        stack.add(val);
    }

    public I pop(){
        if (stack.size() == 0){
            throw new NoSuchElementException();
        }
        return stack.remove(stack.size()-1);
    }

    public boolean empty(){
        return stack.isEmpty();
    }
    public boolean isEmpty(){
        return empty();
    }

    public I peek(){
        if (stack.size() == 0){
            return null;
        }
        return stack.get(stack.size()-1);
    }

    public int search(I val){
        int count = 1;
        for(int i = stack.size()-1;i>=0; i--){
            if(stack.get(i) == val){
                return count ;
            }
            count +=1;
        }
        return -1;
    }

    public I lastElement(){
        return stack.get(stack.size()-1);
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
