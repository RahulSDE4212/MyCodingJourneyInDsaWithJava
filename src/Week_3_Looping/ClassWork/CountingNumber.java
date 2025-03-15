package Week_3_Looping;

import java.util.Scanner;

public class CountingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of numbers you want to enter: ");
        int noOfTerms = sc.nextByte();

        int noOfZero = 0;
        int noOfPos = 0;
        int noOfNeg = 0;
        System.out.println("Enter the numbers: ");
        for(int i = 1;i<=noOfTerms;i++){
            int num = sc.nextInt();
            if(num == 0) noOfZero++;
            else if(num<0) noOfNeg++;
            else noOfPos++;
        }

        System.out.println("Number of +ve number is: " + noOfPos);
        System.out.println("Number of -ve number is: " + noOfNeg);
        System.out.println("Number of zero number is: " + noOfZero);

    }
}
