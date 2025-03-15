package Week_4_Method.Assignment;

public class Ques3 {
    public static void printNumber(int a, int b){
        for(int i=a;i<=b;i++){
            if(i%2==0) System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int a = 10, b = 27;
        printNumber(a,b);
    }
}
