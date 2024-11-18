package Method;
import java.util.*;
public class NoOf2InInteger {
    public static int noOf2In(int num){
        int count = 0;
        int rem;
        while(num != 0){
            rem = num % 10;
            if(rem == 2) count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = sc.nextInt();

        if(num < 0 ) System.out.println("Pls Enter the positive number: ");
        else {
          int count = noOf2In(num);
            System.out.println("The no of digits with value 2 is: " + count);
        }

    }
}
