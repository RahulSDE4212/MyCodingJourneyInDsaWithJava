package PatternPrinting.Assignment;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        n = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n+1-i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
