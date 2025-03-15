package Week_3_Looping;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        for(int i =2;i<=num-1;i++){
            if(num % i == 0) {
                count++;
                break;
            }
        }
        if(num == 1) System.out.println("Neither prime nor composite");
        else if(count == 0 ) System.out.println("Prime number: ");
        else System.out.println("composite number ");
    }
}
