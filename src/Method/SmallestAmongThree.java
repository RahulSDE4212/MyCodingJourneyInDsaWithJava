package Method;

import java.util.Scanner;



public class SmallestAmongThree {

    static class Number{
        void smallest(int a , int b, int c){
            if(a <= b){
                if(a <= c) System.out.println(a + " is the smallest.");
                else System.out.println(c + " is the smallest.");
            }
            else {
                if(b <= c) System.out.println(b + " is the smallest.");
                else System.out.println(c + " is the smallest");
            }
        }

        int average(int a, int b, int c){
            int avg = (a+b+c)/3;
            return avg;
        }

        int sumOfDigits(int num){
            int sum = 0;
            int rem;
            while( num != 0){
                rem = num % 10;
                sum += rem;
                num = num / 10;
            }
            return sum;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        Number num = new Number();
        num.smallest(num1, num2, num3);
        int avg = num.average(num1, num2, num3);
        System.out.println("The average is: " + avg);

        System.out.println("Enter the number whose sum of digit :");
        int n = sc.nextInt();
        int sumOfDigit = num.sumOfDigits(n);
        System.out.println("The sum of digit is: " + sumOfDigit);
    }
}
