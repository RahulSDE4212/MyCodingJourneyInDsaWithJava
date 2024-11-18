package Method;
import java.util.*;
public class TriangularNum {
    public static boolean triangularNumber(int num){
        int sum = 0;
        for(int i = 1;sum < num;i++){
            sum = sum + i;
        }
        return (sum == num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        boolean bool = triangularNumber(num);
//        if(bool) System.out.println("Triangular number");
//        else System.out.println("Not a triangular number: ");


        System.out.println("Enter the number upto which triangular no is to be find: ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            boolean bool = triangularNumber(i);
            if(bool) System.out.println(i + " is a triangular number: ");
        }
    }
}
