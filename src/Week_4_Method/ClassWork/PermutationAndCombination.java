package Week_4_Method;
import java.util.*;
public class PermutationAndCombination {
    public static double factorial(double num){
        int factorial =1;
        for(int i = 1;i<=num;i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static double permutation(double n , double r){
        return (factorial(n) / factorial(n-r));
    }

    public static double combination(double n, double r){
        return factorial(n)/ (factorial(n-r) * factorial(r));
    }
    public static void main(String[] args) {
        System.out.println("Enter the total value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the no of items to be selected: ");
        int r = sc.nextInt();

        System.out.println("Does the order of selection matter: ");
        System.out.println("Select : y/n");
        char ch = sc.next().charAt(0);

        if(ch == 'y' || ch == 'Y') {
            double permut = permutation(n,r);
            System.out.println("The no of ways in which " + r + " can be selected from " + n + " is: " + (int) permut);
        }
        else if(ch == 'n' || ch == 'N'){
            double comb = combination(n,r);
            System.out.println("The no of ways in which " + r + " can be selected from " + n + " is: " +(int) comb);
        }
        else {
            System.out.println("Pls enter y or n :");
        }
    }
}
