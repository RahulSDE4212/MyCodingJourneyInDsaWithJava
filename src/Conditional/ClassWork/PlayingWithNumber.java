package Conditional;
import java.util.*;
public class PlayingWithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the floating point number: ");
        double num = sc.nextDouble();

        if(num == 0) System.out.println("zero");
        else if(num>0){
            if(num<1) System.out.println("small positive number");
            else System.out.println("positive number");
        }
        else{
            if(-(num)<1) System.out.println("small negative number");
            else System.out.println("negative number");
        }
    }
}
