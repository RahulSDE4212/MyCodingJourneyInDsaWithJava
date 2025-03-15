package Week_0_OOps.ClassWork;
import java.util.*;
class Employees{
    String name;
    int age;
    // zero argument constructor
    Employees(){
        System.out.println("the constructor is being called......");
    }
    // instance method
    public void disp(){
        System.out.println("Name is :: "+name);
        System.out.println("Age is  :: " +age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Employees e1  = new Employees();
        e1.disp();
    }
}
