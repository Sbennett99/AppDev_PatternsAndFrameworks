package JCF;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public void testHashSet(){
        Set<Integer> thisSet = new HashSet<>();

        thisSet.add(1);
        thisSet.add(5);
        thisSet.add(3);

        System.out.println("This set: " + thisSet);

        thisSet.remove(1);

        System.out.println("After removal (1): " + thisSet);




    }
    public void testHashSetAdvanced(){
        Set<Integer> thisSet = new HashSet<>();

        thisSet.add(1);
        thisSet.add(2);
        thisSet.add(3);

        Object[] arr = thisSet.toArray();


        System.out.println("This set as array: " + arr);






    }

}
