package Method;
import java.util.*;
public class TwinPrime {
    public static boolean prime(int num){
        int count = 0;
        for(int i=2;i<=num-1;i++){
            if(num % i == 0) {
                count++;
                break;
            }
        }
        return count == 0;
    }
    public static boolean twinPrime(int num){
        if(prime(num)){
            return prime((num + 2));
        }
        else return false;
    }
    public static void main(String[] args) {
        boolean bool;
        System.out.println("Twin primes between 1 to 100: ");
        for(int i = 1;i+2<=100;i++){
            bool = twinPrime(i);
            if(bool) System.out.print("("+ i + ")" + "(" + (i+2) + ") " );
        }
    }
}
