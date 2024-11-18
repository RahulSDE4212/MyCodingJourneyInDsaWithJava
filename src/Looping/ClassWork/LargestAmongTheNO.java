package Looping;

import java.util.Scanner;

public class LargestAmongTheNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char choice;
        System.out.println("Enter the numbers: ");
        int num = sc.nextInt();
        int max = num;
        int min = num;


        while(true) {
            System.out.println("Do you want to continue: Y/N ");
            choice = sc.next().charAt(0);

            if(choice ==  'y' ||  choice == 'Y') {
                int number = sc.nextInt();
                if (number > max) max = number;
                if (number < min) min = number;
            }
            else {
                break;
            }
        }

        System.out.println("The maximum no is: " + max);
        System.out.println("The minimum no is: " + min);
    }
}
