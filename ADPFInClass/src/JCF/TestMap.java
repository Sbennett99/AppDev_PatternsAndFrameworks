package JCF;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public  void testHashMap(){

        Map<Integer, String> thisHmap = new HashMap<>();

        thisHmap.put(1,"X");
        thisHmap.put(2,"Y");
        thisHmap.put(3,"Z");

        System.out.println("This Map : "+ thisHmap);

        thisHmap.remove(1,thisHmap.get(1));
        thisHmap.remove(2);
        System.out.println("Map after remove: " + thisHmap);


    }
    public  void testHashMapADV(){

        Map<Integer, String> thisHmap = new HashMap<>();

        thisHmap.put(1,"X");
        thisHmap.put(2,"Y");
        thisHmap.put(3,"Z");

        System.out.println("This Map : "+ thisHmap);

        thisHmap.forEach((k,v)-> thisHmap.compute(k, (k2,v2)-> v2.concat("A")));
        System.out.println("This Map Appended with A : "+ thisHmap);

        thisHmap.computeIfAbsent(5,k1 -> "B");
        System.out.println("After Compute if Absent: "+thisHmap);

        thisHmap.computeIfPresent(2, (k,v) -> v.concat("B"));
        System.out.println("After Compute if Present: "+ thisHmap);

    }
}
