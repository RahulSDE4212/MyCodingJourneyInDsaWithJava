package PatternPrinting.Assignment;
import java.util.*;
public class Ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 1;
        for(int i = 1;i<=n;i++){
            System.out.print(a++ + " ");
        }
        a -= 2;
        for(int i = 1;i<=n-1;i++){
            System.out.print(a-- + " ");
        }
        System.out.println();

        n = n-1;
        for(int i =1;i<=n;i++){
            int b = 1;
            for(int j = 1;j<=n+1-i;j++){
                System.out.print(b++ + " ");
            }
            b--;
            for(int j =1;j<=2*i-1;j++){
                System.out.print(" " + " ");
            }
            for(int j = 1;j<=n+1-i;j++){
                System.out.print(b-- + " ");
            }

            System.out.println();
        }
    }
}
