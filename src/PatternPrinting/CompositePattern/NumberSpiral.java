package PatternPrinting.CompositePattern;
import java.util.*;
public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();

        for(int i =1;i<=2*n-1;i++){
            for(int j = 1;j<=2*n-1;j++){
                int a = i;
                int b = j;
                if(i>n) a = 2*n-i;
                if(j>n) b = 2*n-j;
                int c = Math.min(a,b);
                System.out.print(n+1-c + " ");
            }
            System.out.println();
        }
    }
}
