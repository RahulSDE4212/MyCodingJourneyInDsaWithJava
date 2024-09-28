package Recursion.HotsQuestion;

public class L231_PowerOfTwo {
    public static boolean isPowerOf2(int n){
        int rem = n % 2;
        if(n==1) return true;
        if(rem != 0) return false;
        return isPowerOf2(n/2);
    }
    public static void main(String[] args) {
        int n = 32;
        boolean bool = isPowerOf2(n);
        System.out.println(bool);
    }
}
