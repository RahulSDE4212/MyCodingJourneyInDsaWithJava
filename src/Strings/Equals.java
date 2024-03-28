package Strings;
import java.util.*;
public class Equals {
    public static void main(String[] args) {
        String a = "Rahul";
        String b = "Rahul";
        String c = new String(a);
        String d = "Ra";
        d += "hul";
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
    }
}
