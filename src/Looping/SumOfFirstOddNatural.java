package Looping;
import java.util.*;
public class SumOfFirstOddNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=num;i++){
            System.out.println(2*i-1);
            sum += 2*i-1;
        }

        System.out.println("The sum of odd natural numbers upto " + num + " terms is: " + sum );


    }
}
