/**
 * Created by calvinwebster on 9/25/17.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;


public class CollectionsDemo {
    public static void main (String[] args) {

        List<Integer> myNums = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            myNums.add(i);
        }
        System.out.println(myNums);

        for (int i = 0; i < 50; i++) {
            myNums.remove(i);
        }
//        System.out.println(myNums.size());

        Set<Integer> mySet = new HashSet<>();

        mySet.add(2);
        mySet.add(2);
        mySet.add(2);
        mySet.add(3);
        mySet.add(3);
        mySet.add(3);
        mySet.add(3);
        mySet.add(5);
//        System.out.println(mySet.size());

        String[] names = { "Calvin", "Chris", "Stephen", "Patrick", "Spencer", "Chad", "Heather", "Kaity", "Andi", "Bubba"};
        Map<String, Integer> nameAges = new HashMap<>();

        for(int i = 0; i < 10; i++) {

            nameAges.put(names[i], 0);

        }
        nameAges.remove("Calvin");
//        System.out.println(nameAges.getOrDefault("Calvin", 0));

        Map<String, Integer> copiedMap = new HashMap<>();

        copiedMap.putAll(nameAges);
        copiedMap.put("Calvin", 0);
//        System.out.println(nameAges);
//        System.out.println(copiedMap);

        copiedMap.remove("Calvin");
        System.out.println(copiedMap.values());


    }
}
