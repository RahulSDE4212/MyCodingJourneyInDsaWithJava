package Recursion.Assignment;
import java.util.*;
public class PowerOf2 {
    public static boolean isPowerOf2(int n){
        // this function says that i am gonna calculate whether n is power of 2 or not
        // i will check whether n divided by 2 leaves the remainder as 0
        // if it is so then n can't be power of 2
        // if it is not so then i will check for n/2
        // unless and until i will not reach to 1
        if(n==1) return true;
        if(n%2!=0) return false;
        return isPowerOf2(n/2);
    }
    public static void main(String[] args) {
        int n = 12;
        boolean bool = isPowerOf2(n);
        System.out.println(bool);
    }
}
