package Week_3_Looping;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int dec = sc.nextInt();
        System.out.println("The decimal number is: " + dec);

        int sum = 0;
        int i = 0;
        while(dec != 0){
            int rem = dec % 2;
            if(rem == 1){
                sum =(int) (1 * Math.pow(10,i)) + sum;
            }
            i++;
            dec = dec / 2;
        }
        System.out.println("The binary number is: " + sum);
    }
}
