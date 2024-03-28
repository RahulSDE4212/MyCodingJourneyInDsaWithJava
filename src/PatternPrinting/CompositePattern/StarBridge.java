package PatternPrinting.CompositePattern;
import java.util.*;
public class StarBridge {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1;i<=2*n-1;i++){
            System.out.print("*" +" ");
        }
        System.out.println();
        n = n-1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n+1-i;j++){ // stars
                System.out.print("*" + " ");
            }
            for(int j=1;j<=2*i-1;j++){ // spaces
                System.out.print(" " + " ");
            }
            for(int j =1;j<=n+1-i;j++){ // stars
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
