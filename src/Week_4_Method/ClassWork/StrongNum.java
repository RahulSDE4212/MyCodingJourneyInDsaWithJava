package Week_4_Method;

import java.util.Scanner;

public class StrongNum {

    public static boolean strongNumber(int number){
        int sum = 0;
        int n = number;
        int rem;
        int factorial = 1;
        while(number != 0){
            rem = number % 10;
            factorial = 1;
            for(int i = rem;i >= 1; i--){
                factorial = factorial * i;
            }
            sum = sum  + factorial;
            number = number / 10;
        }
        return n == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        boolean bool = strongNumber(num);
        if(bool) System.out.println("Strong number: ");
        else System.out.println("Not a strong number: ");

    }
}
