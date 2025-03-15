package Week_6_ArraysAndArrayList.Leetcode;
import java.util.*;
public class _2037_MinimumNoOfMovesToSeatEveryone {
    public static int minMovesToSeat(int[] seats, int[] students) {
        /* *************** Approach-1 : using sorting and two-pointers *********************
        * Time complexity  : O(nlogn)
        * Space complexity : O(1)
        * Algorithm:
        *      Step 1 : sort both the arrays students and seats and initialize count variable to 0.
        *      Step 2 : use two pointers to traverse students and seats respectively.
        *      Step 3 : if seats[i] != students[j]
        *               -> add their difference in count variable which was initialized with 0 in step 1.
        *      Step 4 : after both the arrays have been traversed, return the count varaible.
        * */
        Arrays.sort(seats);
        Arrays.sort(students);
        int noOfMoves = 0;
        int i = 0;
        int j = 0;
        while(i<seats.length && j<students.length){
            if(seats[i]!=students[j]){
                noOfMoves += Math.abs(seats[i]-students[j]);
            }
            i++;
            j++;
        }
        return noOfMoves;
    }
    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        int moves = minMovesToSeat(seats,students);
        System.out.println(moves);
    }
}
