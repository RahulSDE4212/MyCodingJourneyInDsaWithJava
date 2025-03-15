package Week_0_OOps.ClassWork;
import java.util.*;
class Person{
    public String name;
    public int age;
    public String address;
}
class Students extends Person{
    public int marks;
    public String grade;
    Students(String name, int age, String address, int marks, String grade){
        this.grade = grade;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.address = address;
    }
    public void disp(){
        System.out.println("Name is     :: "+name);
        System.out.println("Age is      :: "+age);
        System.out.println("Address is  :: "+address);
        System.out.println("Marks is    :: "+marks);
        System.out.println("grade is    :: "+grade);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Students s1 = new Students("Rahul",19,"noida",49,"A+");
        s1.disp();
    }
}
