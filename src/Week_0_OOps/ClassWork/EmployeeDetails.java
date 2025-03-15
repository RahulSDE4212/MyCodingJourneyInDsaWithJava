package Week_0_OOps.ClassWork;
import java.util.*;
class Employee{
    private int eid;
    private String ename;
    private int eage;
    public void setEid(int eid){
        this.eid = eid;
    }
    public void setEname(String ename){
        this.ename = ename;
    }
    public void setEage(int eage){
        this.eage = eage;
    }

    public int getEid(){
        return eid;
    }
    public String getEname(){
        return ename;
    }
    public int getEage(){
        return eage;
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEage(18);
        e1.setEid(123);
        e1.setEname("rahul");

        System.out.println("name is:: " + e1.getEname());
        System.out.println("id is:: " + e1.getEid());
        System.out.println("age is:: " + e1.getEage());
    }
}
