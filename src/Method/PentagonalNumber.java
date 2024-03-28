package Method;

import java.util.Scanner;

public class PentagonalNumber {
    public static boolean pentagonalNumber(int num){
        int sum = 0;
        for(int i = 1;sum<num;i+=3){
            sum = sum + i;
        }
        return (num==sum);
    }
    public static void main(String[] args) {
//        System.out.println("Enter the number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        boolean bool = pentagonalNumber(num);
//        if(bool) System.out.println("Pentagonal number: ");
//        else System.out.println("Not a pentagonal number: ");
        int count = 1;
        int i = 1;
        boolean bool;
        while(count <= 50){
            bool = pentagonalNumber(i);
            if(bool) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}
