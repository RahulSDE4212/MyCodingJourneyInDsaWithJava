package Recursion.Assignment;

public class Stair1_2_3Steps {
    public static int stair(int n){
        // this function doesn't know the answer
        // what he knows is that i can jump only 1 or 2 or 3 steps at a time
        // so the number of ways i can climb nth step will depend on the no of ways
        // i can climb n-1th step + n-2th step + n-3th step
        if(n<=2) return n;
        if(n==3) return 4;
        return stair(n-1) + stair(n-2) + stair(n-3);

    }
    public static void main(String[] args) {
        int noOfWays = stair(5);
        System.out.println("The no of ways are : " + noOfWays);
    }
}
