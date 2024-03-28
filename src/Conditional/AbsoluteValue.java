package Conditional;
import java.util.*;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int integer = sc.nextInt();

        if(integer < 0) System.out.println(-1*integer);
        else System.out.println(integer);
    }
}
