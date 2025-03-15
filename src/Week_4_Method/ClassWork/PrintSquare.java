package Week_4_Method;

import java.util.Scanner;


public class PrintSquare {

    static class Square{
        void printSquare(int num){
            for(int i = 1;i<=num;i++){
                System.out.print((i*i) + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n to print square of first n natural no: ");
        int n = sc.nextInt();

        Square sq = new Square();
        sq.printSquare(n);

    }
}
