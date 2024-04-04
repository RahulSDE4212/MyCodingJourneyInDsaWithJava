package Looping.Assignment;
import java.util.*;
public class Ques5 {
    public static void main(String[] args) {
        System.out.println("Fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of terms: ");
        int terms = sc.nextInt();
        int num1 = 1, num2 = 1;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for(int i=1;i<=terms-2;i++){
            int sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;

        }
    }
}
