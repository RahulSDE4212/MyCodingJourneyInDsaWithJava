package Conditional;
import java.util.*;
public class DecimalUptoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first decimal no: ");
        double dec1 = sc.nextDouble();
        System.out.println("Enter the second decimal no.");
        double dec2 = sc.nextDouble();


        dec1 = dec1 * 1000;
        dec2 = dec2 * 1000;

        dec1 = (int)dec1;

        dec2 = (int)dec2;

        if(dec1 == dec2) System.out.println("they are same upto three decimal places");
        else System.out.println("They are not same : ");
    }
}
