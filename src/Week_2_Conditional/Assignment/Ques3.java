package Week_2_Conditional.Assignment;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cp: ");
        int cp = sc.nextInt();
        System.out.println("Enter the sp: ");
        int sp = sc.nextInt();
        if(cp>sp) System.out.println("loss occurred");
        else if(cp==sp) System.out.println("no loss no profit");
        else System.out.println("profit");
    }
}
