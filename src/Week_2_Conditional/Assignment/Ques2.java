package Week_2_Conditional.Assignment;

import java.util.Scanner;

public class Ques2 {
    public static int absoluteValue(int num){
        if(num<0) return -1 * num;
        else return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ans = absoluteValue(num);
        System.out.println(ans);

    }
}
