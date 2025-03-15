package Week_4_Method.Assignment;

public class Ques4 {
    public static void squareofNum(int num){
        System.out.println(num*num);
    }
    public static void noOfDigit(int num){
        int count = 0;
        int n = num;
        while(n>0){
            count++;
            n = n / 10;
        }
        System.out.println(count);
        squareofNum(num);
    }

    public static void main(String[] args) {
        int num = 1234;
        noOfDigit(num);
    }
}
