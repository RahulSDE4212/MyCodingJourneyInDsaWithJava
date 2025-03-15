package Week_3_Looping;

import java.util.Scanner;

public class RoundOff_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int i = 0;

        while((int)(Math.pow(2,i)) <= num){
            i++;
        }

        System.out.println("The next lower multiple of 2 is: " + (int)(Math.pow(2,i-1)));

    }
}
