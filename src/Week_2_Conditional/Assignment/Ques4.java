package Week_2_Conditional.Assignment;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // logic for leap year
        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
