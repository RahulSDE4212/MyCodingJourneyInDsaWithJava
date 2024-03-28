package Looping;
import java.util.*;
public class ReverseMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i =10;i>=1;i--){
            System.out.println(num + " * " + i + " = " + (num*i));
        }

    }
}
