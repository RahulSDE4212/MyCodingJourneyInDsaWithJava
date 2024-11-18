package Looping;
import java.util.*;
public class FactorialOfNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to find: ");
        int num = input.nextInt();
        int factorial = 1;
        for(int i = num;i>=1;i--){
            factorial *= i;
        }
        System.out.println("The factorial  " + num + " is: " + factorial);
    }

}
