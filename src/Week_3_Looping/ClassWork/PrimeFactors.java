package Week_3_Looping;
import java.util.*;
public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();

        //traversing all the numbers between 2 and num
        for(int i = 2;i <= num; i++){
            int count = 0;
            if(num % i == 0) {
                // checking i is prime or not

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if(count == 0) System.out.print(i + " ");
            }

        }


    }
}
