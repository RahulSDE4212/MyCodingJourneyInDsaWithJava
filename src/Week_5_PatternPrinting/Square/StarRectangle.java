package Week_5_PatternPrinting.Square;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1;i<=row;i++)
        {
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
