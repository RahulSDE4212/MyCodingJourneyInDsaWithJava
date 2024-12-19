package Recursion.ClassWork;
import java.util.*;
public class SubsequencesOfAnArray {
    public static void printSubsequences(int[] nums) {
        generateSubsequences(nums, 0, new ArrayList<>());
    }

    private static void generateSubsequences(int[] nums, int index, List<Integer> current) {
        if (index == nums.length) {
            System.out.println(current);
            return;
        }

        // Include the current element
        current.add(nums[index]);
        generateSubsequences(nums, index + 1, current);

        // Exclude the current element
        current.remove(current.size() - 1);
        generateSubsequences(nums, index + 1, current);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        printSubsequences(nums);
    }
}
