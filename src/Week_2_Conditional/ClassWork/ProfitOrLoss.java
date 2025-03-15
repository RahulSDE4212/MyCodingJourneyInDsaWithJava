package Week_2_Conditional;
import java.util.*;
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        int cp = sc.nextInt();

        System.out.println("Enter the selling price: ");
        int sp = sc.nextInt();

        if(sp>cp) System.out.println("profit "+ (sp-cp));
        else if(sp<cp) System.out.println("loss" + (cp-sp));
        else System.out.println("no loss no profit");
    }
}
