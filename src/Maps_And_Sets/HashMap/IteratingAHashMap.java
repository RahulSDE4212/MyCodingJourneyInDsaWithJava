package Maps_And_Sets.HashMap;
import java.util.*;
public class IteratingAHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Rahul",1);
        map.put("Rohit",10);
        map.put("Himanshu",123);
        map.put("Manish",234);
        map.put("pawan",21);
        System.out.println(map); // inbuilt method to print the map
        System.out.println();
        for(String key: map.keySet()){
            int val = map.get(key);
            System.out.println(key + " :" + val);
        }
        System.out.println();

        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();

        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
