package HeapsAndPriorityQueue.Heaps;

import java.util.*;

class Student implements Comparable<Student>{
    int rno;
    String name;
    double perc;
    Student(int rno, String name, double perc){
        this.rno = rno;
        this.name = name;
        this.perc = perc;
    }

    public int compareTo(Student S){
        //return this.rno - S.rno; // sorting on the basis of roll no
        //return (int)(this.perc - S.perc); // sorting on the basis of percentage.
        return this.name.charAt(0) - S.name.charAt(0);
    }
}
public class CustomComparator {
    public static void print(Student[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i].name + " ");
            System.out.print(arr[i].perc+ " ");
            System.out.println(arr[i].rno);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(10, "Rahul", 78.9);
        s[1] = new Student(24, "Aniket", 98.23);
        s[2] = new Student(9, "Ashutosh", 50.45);
        s[3] = new Student(12, "Manish", 99.99);
        print(s);
        Arrays.sort(s);
        // This is giving error as it is not clear that on which parameter you want to sort the object.
        // You want to sort it on the basis of rno
        // You want to sort it on the basis of percentage.
        // Hence, we use custom comparator with the class of the object. Here with the class Student.
        print(s);
    }

 
}
