package Week_5_PatternPrinting.Assignment;

import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" " + " ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
