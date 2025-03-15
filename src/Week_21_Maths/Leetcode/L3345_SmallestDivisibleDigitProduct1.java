package Week_21_Maths.Leetcode;

import java.util.Scanner;

public class L3345_SmallestDivisibleDigitProduct1 {
    public static boolean helper(int i, int t){
        int product = 1;
        while(i!=0){
            int rem = i % 10;
            product *= rem;
            i = i / 10;
        }
        if(product % t == 0) return true;
        return false;
    }
    public int smallestNumber(int n, int t) {
        // Approach 1 : using math.
        int smallest = n;
        int largest = n + 9;
        for(int i=smallest;i<=largest;i++){
            if(helper(i,t)) return i;
        }
        return 1000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int i = sc.nextInt();

        System.out.println("Enter t: ");
        int t = sc.nextInt();


    }
}
