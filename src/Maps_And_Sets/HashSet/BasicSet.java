package Maps_And_Sets.HashSet;

import java.util.HashSet;

public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Adding element into set --> T.C.- O(1)
        set.add(200);
        set.add(45);
        set.add(-100);
        set.add(40);
        System.out.println(set);

        // Searching an element in Hashset --> T.C. -- O(1)
        // return true or false.
        System.out.println(set.contains(50));
        System.out.println(set.contains(-100));

        // Removing element from HashSet --> T.C. -- O(1)
        System.out.println(set);
        set.remove(200);
        System.out.println(set);

        // Size of set --> T.C. -- O(1)
        System.out.println("Size is " + set.size());
        set.add(1);
        System.out.println("Size is " + set.size());

        // Deleting all the elements from the set
        set.clear();
        System.out.println(set);
    }
}
