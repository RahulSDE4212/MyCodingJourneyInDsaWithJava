package Week_3_Looping;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int n = num;
        int n2 = num;

        int count = 0;
        while(n != 0){
            n = n / 10;
            count++;
        }
        System.out.println(count);

        int armNum = 0;
        int rem;
        while(num != 0 ){
            rem = num % 10;
            armNum = (int)(armNum + Math.pow(rem,count));
            num = num / 10;

        }

        if((n2 == armNum)) System.out.println("Armstrong number: ");
        else System.out.println("Not an armstrong number: ");

    }
}
