package Conditional;
import java.util.*;
public class UppercaseOrLowercase {
    public static void main(String[] args) {
        System.out.println("Enter the character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if((int)ch>=65 && (int)ch<=90) System.out.println("uppercase alphabet: ");
        else if((int)ch>=97 && (int)ch<=122) System.out.println("lowercase alphabet");
        else System.out.println("Not an alphabet: ");
    }
}
