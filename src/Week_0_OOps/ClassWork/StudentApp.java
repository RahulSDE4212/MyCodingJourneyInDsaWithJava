package Week_0_OOps.ClassWork;
import java.util.*;
class Student{
    private int rollNo;
    private String name;
    private String address;

    // setter method
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // getter method
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}
public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student();
        // calling setter method
        s1.setRollNo(12);
        s1.setAddress("noida");
        s1.setName("rahul");

        // calling getter method
        System.out.println("Name is :: " + s1.getName());
        System.out.println("Roll no is :: " + s1.getRollNo());
        System.out.println("Address is :: " + s1.getAddress());

    }
}
