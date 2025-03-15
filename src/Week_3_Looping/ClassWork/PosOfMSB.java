package Week_3_Looping;

import java.util.Scanner;

public class PosOfMSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int count = 0;
        int rem = 1;
        while(num != 0){
            rem = num % 10;
            num = num / 10;
            count++;
        }
        System.out.println("The most significant bit is: " + rem);
        System.out.println("the position of Msb is: "+ count);

    }
}
