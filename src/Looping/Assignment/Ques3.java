package Looping.Assignment;

public class Ques3 {
    public static void main(String[] args) {
        int num1 = 7, num2 = 14;
        int min = Math.min(num1,num2);
        int gcd = 1;
        for(int i=2;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }
        System.out.println("The hcf is : " + gcd);
    }
}
