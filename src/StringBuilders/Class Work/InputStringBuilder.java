package StringBuilders;
import java.util.Scanner;
public class InputStringBuilder {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        // method 1:
        StringBuilder st = new StringBuilder(sb);
        System.out.println(st);
        // method 2:
        StringBuilder a = new StringBuilder(sc.nextLine());
        System.out.println(a);

    }
}
