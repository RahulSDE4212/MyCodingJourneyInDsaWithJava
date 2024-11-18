package Looping;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int num = sc.nextInt();
        int duplicateNum = num;

        // logic for checking whether the number is binary number or not
        while(duplicateNum != 0){
            int remainder = duplicateNum % 10;

            if(remainder != 0 && remainder != 1) {
                System.out.println("not a binary number: ");
                return;
            }
            duplicateNum /= 10;
        }

        // logic for converting binary number to decimal number
        int i = 0;
        int decimalNo = 0;
        while(num!=0){
            int remainder = num % 10;
            if(remainder == 1) {
                decimalNo = (int) (decimalNo + Math.pow(2, i));
            }
            i++;
            num = num / 10;
        }
        System.out.println("The decimal number is: " + decimalNo);


    }
}
