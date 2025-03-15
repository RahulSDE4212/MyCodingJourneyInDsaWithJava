package Week_3_Looping;

import java.util.Scanner;

public class RightTriangleWithIncreasedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        int number = 1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print((number++) + " ");
            }
            System.out.println();
        }
    }
}
