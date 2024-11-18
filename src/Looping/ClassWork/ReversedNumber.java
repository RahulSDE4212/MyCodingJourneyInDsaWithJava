package Looping;
import java.util.*;
public class ReversedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five digit number:");
        int number = sc.nextInt();
        int actulNumber = number;
        int num = number;
        int noOfDigit = 0;

        while(num!=0){
            num = num / 10;
            noOfDigit++;
        }

        if(noOfDigit!=5) {
            System.out.println("pls enter the 5 digit number: ");
            return;
        }

        int reverseNumber = 0 ;
        int remainder;
        while(number!=0){
            remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number / 10;
        }

        if(reverseNumber == actulNumber) System.out.println("the orginal number and the reversed number are equal: ");
        else System.out.println("they are different: ");


    }
}
