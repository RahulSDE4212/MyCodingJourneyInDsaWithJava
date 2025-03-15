package Week_4_Method;
import java.util.*;
public class FactorsOfThree {
    public static void factorsOfThree(int num){
        int n = num;
        for(int i = 2;i<=num;i++){
            while(num % i == 0){
                System.out.print(i + " * ");
                num = num / i;
            }

        }
        System.out.print( "1");
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(num + " = ");
        factorsOfThree(num);
    }
}
