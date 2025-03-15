package Week_3_Looping;
import java.util.*;
public class FactorsOfNegNum {
    public static void main(String[] args) {
        System.out.println("enter the negative number: ");
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();

        if(num>0) {
            System.out.println("pls enter the negative number: ");
            return;
        }

        for(int i = num;i<=(-(num));i++){
            if(i == 0) continue;
            if(num % i == 0) System.out.print(i + " ");
        }

    }
}
