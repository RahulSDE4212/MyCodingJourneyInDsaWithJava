package Week_3_Looping.Assignment;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i<=n*10;i+=n){
            System.out.print(i+ " ");
        }

    }
}
