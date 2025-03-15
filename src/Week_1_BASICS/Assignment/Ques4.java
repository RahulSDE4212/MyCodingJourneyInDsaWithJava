package Week_1_BASICS.Assignment;

public class Ques4 {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(a++); // first use the value of a then increment it
        System.out.println(++a); // first increment the value of a then use it
        System.out.println(a--); // first use the value of a then decrement it
        System.out.println(--a); // first decrement the value of a then use it

        int c = a % 2; // gives the remainder when a is divided by 2
        System.out.println(c);
    }
}
