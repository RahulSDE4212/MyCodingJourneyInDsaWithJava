package Week_20_Maps_And_Sets.HashSet;
import java.util.HashSet;
public class IteratingASet {
    public static void main(String[] args) {
        /* Iterating by using simple for loop is not possible in HashSet because there
           is no concept of indexing.Hence, we use for-each loop. */

        HashSet<Integer> set = new HashSet<>();
        set.add(200);
        set.add(45);
        set.add(-100);
        set.add(40);

        for(int ele : set){
            System.out.print(ele + " ");
            /* while traversing a HashSet, we cannot add or remove any element.
                -> set.add(1)    -> will give the error.
                -> set.remove(1) -> will give the error. */
        }
    }
}
