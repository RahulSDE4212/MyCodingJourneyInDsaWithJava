package Week_3_Looping;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res;
        if(num1 < num2) res = num1;
        else res = num2;
        int hcf = 1;

        for(int i=1;i<=res;i++){
            if(num1 % i == 0 && num2 % i == 0) hcf = i;
        }

        System.out.println("The hcf is: " + hcf);

    }
}
