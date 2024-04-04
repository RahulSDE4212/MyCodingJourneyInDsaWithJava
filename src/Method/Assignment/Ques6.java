package Method.Assignment;

public class Ques6 {
    public static void area(int num){
        System.out.println(num*num);
    }
    public static void area(float num){
        System.out.println(num*num);
    }
    public static void main(String[] args) {
        int num1 = 12;
        float num2 = 12.0f;
        area(num1);
        area(num2);

    }
}
