package Looping.Assignment;
import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int n1 = n;
        int reverseNo = 0;
        while(n>0){
            int rem = n % 10;
            reverseNo = reverseNo * 10 + rem;
            n = n / 10;
        }
        if(n1==reverseNo) System.out.println("palindrome no: ");
        else System.out.println("Not a palindrome no ");
    }
}
