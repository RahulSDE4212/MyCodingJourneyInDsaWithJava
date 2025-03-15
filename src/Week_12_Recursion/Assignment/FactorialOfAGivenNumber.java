package Week_12_Recursion.Assignment;
import java.util.*;
public class FactorialOfAGivenNumber {
    public static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("The factorial of " + n + " is: " + fact);
    }
}
