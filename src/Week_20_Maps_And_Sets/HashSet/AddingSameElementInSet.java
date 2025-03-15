package Week_20_Maps_And_Sets.HashSet;

import java.util.HashSet;

public class AddingSameElementInSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Raghav");
        set.add("Rahul");
        set.add("Rohit");
        System.out.println(set);
        set.add("Raghav");
        set.add("Rahul");
        set.add("Rohit");
        /*
            -> In HashSet only unique elements are allowed.
            -> No repetition is allowed in HashSet.
        */
        System.out.println(set);
    }
}
