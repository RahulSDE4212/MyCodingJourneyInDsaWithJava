package Week_20_Maps_And_Sets.TreeSet;

import java.util.TreeSet;

public class Basics {
    public static void main(String[] args) {
        /*
        * TreeSet is basically Balanced Binary Seach tree.
        * TreeSet --> ordered set
        * HashSet --> unordered set.
        * */
        TreeSet<Integer> set = new TreeSet<>();

        // Adding element into set --> T.C.- O(logn)
        set.add(200);
        set.add(45);
        set.add(-100);
        set.add(40);

        // Searching an element in Hashset --> T.C. -- O(logn)
        // return true or false.
        System.out.println(set.contains(50));
        System.out.println(set.contains(-100));

        // Removing element from HashSet --> T.C. -- O(logn)
        set.remove(200);

        // Size of set --> T.C. -- O(logn)
        set.add(1);
        System.out.println("Size is " + set.size());

        // Deleting all the elements from the set
        //set.clear();
        System.out.println(set);
    }
}
