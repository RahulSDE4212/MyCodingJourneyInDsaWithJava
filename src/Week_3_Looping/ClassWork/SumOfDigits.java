package Week_3_Looping;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int remainder;
        int sum = 0;
        while(num!=0){
            remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }

        System.out.println("The sum is: " + sum);
    }
}
