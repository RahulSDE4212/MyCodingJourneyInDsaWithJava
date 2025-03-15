package Week_0_OOps.ClassWork;
import java.util.*;
class morph{
    public void callMethod(String s){
        System.out.println("String method is called......");
    }
    public void callMethod(StringBuffer o){
        System.out.println("StringBuffer method is called......");
    }
//    public void callMethod(Integer a){
//        System.out.println("Integer method is called......");
//    }
    public void callMethod(Float l){
        System.out.println("float method is called......");
    }

}
class poly{
    public int a;
    public int b;
//    public void add(int a, int b){
//        System.out.println("int-int method");
//    }
//    public void add(float a, float b){
//        System.out.println("float-float method");
//    }
//    public void add(double a, double b){
//        System.out.println("double-double method");
//    }
//    public void add(int a){
//        System.out.println("int method");
//    }
//    public void add(float a){
//        System.out.println("float method");
//    }

    public void add(int a, float b){
        System.out.println("int-float method:: ");
    }
    public void add(float a, int b){
        System.out.println("float-int method:: ");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
//        poly p1 = new poly();
//        p1.add(2,4);
//        p1.add(21.2f,23.5f);
//        p1.add(21.54,22.99);
//        p1.add('a');
//        p1.add(10L);
//        p1.add(10,10); ambiguous method call. the compiler is confused which method to bind
//        p1.add(10,20.3f);
//        p1.add(20.3f,10);

//          morph m1 = new morph();
//          m1.callMethod("rahul");
//          m1.callMethod(new Object());
//          m1.callMethod(null);
         morph m1 = new morph();
//          m1.callMethod(null);
        Byte b = 3;
        //m1.callMethod(3);
    }
}
