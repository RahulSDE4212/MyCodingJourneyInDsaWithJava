package Week_4_Method;
import java.util.*;
public class PalindromeNum {
    public static boolean palindromeNumber(int num){
        int n = num;
        int reverseNo = 0;
        int rem;
        while(num != 0){
            rem = num % 10;
            reverseNo = reverseNo * 10 + rem;
            num = num / 10;
        }
        return (n == reverseNo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean bool = palindromeNumber(num);
        if(bool) System.out.println("This is a palindrome number: ");
        else System.out.println("Not a palindromic no.");
    }
}
