package Recursion.Assignment;
import java.util.ArrayList;
import java.util.List;
public class GenerateArrays {
    // Function to generate all possible arrays
    public static void generateUtil(int[] A, int[] B, List<Integer> currentArray, int i, int j, boolean flag) {
        // If the current array ends with an element from B, print it
        if (currentArray.size()>0 && currentArray.size() % 2 == 0) {
            System.out.println(currentArray);
        }

        // If the turn is to pick from array A
        if (flag) {
            // Choose each element from A starting from index i and append to currentArray
            for (int k = i; k < A.length; k++) {
                if (currentArray.size() == 0 || A[k] > currentArray.get(currentArray.size() - 1)) {
                    currentArray.add(A[k]);
                    // Recursion call to pick next element from B
                    generateUtil(A,B, currentArray,k+1,j, !flag);
                    // Backtrack by removing the last element
                    currentArray.remove(currentArray.size() - 1);
                }
            }
        }
        // If the turn is to pick from array B
        else {
            for (int k = j; k < B.length; k++) {
                if (B[k] > currentArray.get(currentArray.size() - 1)) {
                    currentArray.add(B[k]);
                    // Recursion call to pick next element from A
                    generateUtil(A, B, currentArray,i, k + 1, !flag);
                    // Backtrack by removing the last element
                    currentArray.remove(currentArray.size() - 1);
                }
            }
        }
    }

    // Helper function to start generating arrays
    public static void generateAllArrays(int[] A, int[] B) {
        // Create an empty list to store current combination
        List<Integer> currentArray = new ArrayList<>();
        // Call recursive function starting from array A
        generateUtil(A, B, currentArray, 0, 0, true);
    }

    public static void main(String[] args) {
        // Sample arrays
        int[] A = {10, 15, 25};
        int[] B = {1, 17, 20, 30};

        // Generate all possible arrays
        generateAllArrays(A, B);
    }
}
