package Week_12_Recursion.Assignment;

public class SumOfOddNoBtwAAndB {
    public static int sumOfOdd(int a, int b , int sum){
        // this function says that if a is odd then add a to sum.
        // rest of the work i mean calculating the sum of odd no btw
        // a+1 and b will be done by the recursion
        if(a==b+1) return sum;
        if(a%2!=0) return sumOfOdd(a+1,b,sum+a);
        return sumOfOdd(a+1,b,sum);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // sum = 5 + 7 + 9 + 11 + 13 = 45
        int sum = sumOfOdd(a,b,0);
        System.out.println("the sum is : " + sum);
    }
}
