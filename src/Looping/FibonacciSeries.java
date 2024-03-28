package Looping;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms of fibonacci series: ");
        int term = sc.nextInt();
        int s1 = 0;
        int s2 = 1;
        int s3;

        System.out.print(s1 + " ");
        System.out.print(s2 + " ");
        for(int i = 1;i<=term-2;i++){
            s3 = s1 + s2;
            System.out.print(s3 + " ");
            s1 = s2;
            s2 = s3;
        }

    }
}
