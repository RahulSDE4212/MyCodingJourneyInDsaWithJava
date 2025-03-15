package Week_3_Looping;
import java.util.*;
public class SumOfEvenNatural {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The sum is: "+ (n*(n+1)));
    }
}
