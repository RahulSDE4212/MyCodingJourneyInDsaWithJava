package Week_12_Recursion.ClassWork;

public class FunctionCall {
    public static void banana(){
        System.out.println("I am in banana");
    }
    public static void mango(){
        banana();
        System.out.println("I am in mango");
    }
    public static void apple(){
        mango();
        System.out.println("I am in apple");
        mango();
    }
    public static void main(String[] args) {
        System.out.println("I am in main");
        apple();
    }
}
