package Maps_And_Sets.TreeMap;

import java.util.TreeMap;

public class Basics {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        /* Insertion/Updation in HashMap : T.C. : O(1) */
        map.put("Rahul", 13);
        map.put("Rohit", 14);
        map.put("Ashutosh", 21);
        map.put("Pawan",24);

        /* ******* Getting the value corresponding to the particular key: T.C.O(1)  **********/
        int val = map.get("Rahul");
        //int val2 = map.get("Ranjan");
        System.out.println(val);
        //System.out.println(val2);

        System.out.println(map.size()); // return the size of the hashMap.

        /********** Removal of pair from HashMap *************/
        System.out.println(map);
        map.remove("Rahul");
        System.out.println(map);

        System.out.println(map.containsKey("Rahul")); // Searching in the HashMap. T.C.= O(1)
        System.out.println(map.containsValue(1));
        System.out.println(map);
    }
}
