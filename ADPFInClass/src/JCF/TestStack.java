package JCF;

import java.util.Stack;

public class TestStack {

    public static void testStack(){

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(5);

        System.out.println(stack);
        System.out.println(stack.search(2));
        System.out.println("\nReverse");
        System.out.print("[");
        for(int i = stack.size()-1; i>=0; i--){
            if(i!=0) {
                System.out.print(stack.get(i) + ", ");
            }
            else {
                System.out.println(stack.get(i) + "]");
            }
        }

        System.out.println("Proof Stack was not changed");
        System.out.println(stack);


        System.out.println("\nPopping Item: " + stack.pop());

        System.out.println(stack);

        System.out.println("\nPeeking in the stack: " + stack.peek());
        // Should Be unchanged
        System.out.println(stack);

        System.out.println("\nIs the Stack empty: " + stack.empty());

        System.out.println("\nAdding Vs Pushing ?");
        System.out.println("adding 7");
        stack.add(7);
        System.out.println(stack);
        System.out.println("Pushing 13");
        stack.push(13);
        System.out.println(stack);

        System.out.println("Adding can be index specified while pushing is only at the end");




    }

}
