package Method;
import java.util.*;
public class NatureOfDigitOfNum {
    public static int noOfDigit(int num){
        int count=0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }
    public static void natureOfDigitOfNum(int num){
        int nodigit = noOfDigit(num);
        int countEven = 0;
        int countOdd = 0;
        int rem;
        while(num!=0){
            rem = num % 10;
            if(rem % 2 == 0) countEven++;
            else countOdd++;
            num = num / 10;
        }
        if(countEven == nodigit ) System.out.println("all digits are even");
        else if(countOdd == nodigit) System.out.println("all digits are odd");
        else System.out.println("the digit of the number are mixed");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        natureOfDigitOfNum(num);
    }
}
