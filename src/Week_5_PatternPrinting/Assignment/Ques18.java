package Week_5_PatternPrinting.Assignment;
import java.util.*;
public class Ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((i+j==((n+1)/2)+1) || (j-i==n/2) || (i-j==n/2) || (i+j==n + ((n+1)/2))){
                    System.out.print("*"+ " ");
                }
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
