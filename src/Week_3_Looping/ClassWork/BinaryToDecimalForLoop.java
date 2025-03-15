package Week_3_Looping;

import java.util.Scanner;

public class BinaryToDecimalForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int num = sc.nextInt();

        int n = num;
        int dec=0,i=1,p=1;
        for(int k = n;k>0;k=k/10){
            int rem = k % 10;
            if(rem!=0 && rem!=1) {
                System.out.println("this is not a binary number: ALERT");
                return;
            }
        }

        for(int j=n;j>0;j=j/10){
            int rem = j % 10;
            if(i!=1) p = p * 2;
            i++;

            dec = dec + (p * rem);
        }
        System.out.println("The binary number is: " + n);
        System.out.println("The corresponding decimal no is : " + dec);


    }
}
