package Week_5_PatternPrinting.CompositePattern;
import java.util.*;
public class StarDiamond {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = n-1;
        int nst = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=nsp;j++){
                System.out.print(" "+ " ");
            }
            for(int j =1;j<=nst;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
        nst -= 4;
        n = n-1;

        for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(" "+ " ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
            nst -= 2;
        }
    }
}
