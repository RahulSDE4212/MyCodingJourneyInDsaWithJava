package Method;
import java.util.*;
public class ConsuctiveNumber {
    public static boolean consecutiveNumber(int num1, int num2, int num3){
        if(num2 == (num1+1)){
            return (num3 == (num2+1));
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean bool = consecutiveNumber(num1, num2, num3);
        if(bool) System.out.println("Consecutive number: ");
        else System.out.println("Not a consecutive number: ");
    }
}
