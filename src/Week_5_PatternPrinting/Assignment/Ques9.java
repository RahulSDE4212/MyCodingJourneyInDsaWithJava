package Week_5_PatternPrinting.Assignment;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
