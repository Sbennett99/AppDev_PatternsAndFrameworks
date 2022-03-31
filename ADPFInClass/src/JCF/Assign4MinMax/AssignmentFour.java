package JCF.Assign4MinMax;

import JCF.Test;

public class AssignmentFour {

    public static void main(String[] args) {

        MinHeap min = new MinHeap();
        MaxHeap max = new MaxHeap();


        min.insert(10);
        min.insert(14);
        min.insert(19);
        min.insert(26);
        min.insert(31);
        min.insert(42);
        min.insert(27);
        min.insert(44);
        min.insert(35);
        min.insert(33);

        // Each Function obviously modifies the heap so only one at a time may be ran

        //Problem01(min);
        //Problem02(min);
        //Problem03(min);
        //Problem04(min);




    }

    public static void Problem01(MinHeap H){
        H.delete();
        System.out.println("Second smallest is : "+H.delete());
    }

    public static void Problem02(MinHeap H){
        System.out.println("Smallest is : "+H.delete());
    }

    public static void Problem03(MinHeap H){
        int small = H.delete();

        int large = small;
        while(!H.isEmpty()){
            large = H.delete();
        }
        System.out.println("Sum of Min("+ small + ") and max("+large+")  is : "+ (small+large));
    }

    public static void Problem04(MinHeap H){
        int num = 0;
        int returner = 0;
        while(!H.isEmpty()){
            returner = num;
            num = H.delete();
        }
        System.out.println("Second Largest is : "+ (returner));
    }


}
