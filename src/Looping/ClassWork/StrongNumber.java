package Looping;
import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int n = num;

        int sum = 0;
        int factorial = 1;
        int rem;
        while(num!=0){
            rem = num % 10;
            factorial = 1;
            for(int i=rem;i>=1;i--){
                factorial = factorial * i;
            }
            sum = sum + factorial;
            num = num / 10;
        }

        if(n == sum) System.out.println("Strong number: ");
        else System.out.println("Not a Strong number: ");
    }
}
