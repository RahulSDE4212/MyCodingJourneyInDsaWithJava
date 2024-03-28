package Strings;
import java.util.Scanner;
public class IntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int n = sc.nextInt();
        String s = n + "";
        System.out.println(s);
    }
}
