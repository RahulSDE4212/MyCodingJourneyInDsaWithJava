package Week_7_Strings.ClassWork;
import java.util.Scanner;
public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
//        String str = sc.next();
//        System.out.print(str);
        String s = sc.nextLine();
        System.out.print("Hi ");
        System.out.println(s);
    }
}
