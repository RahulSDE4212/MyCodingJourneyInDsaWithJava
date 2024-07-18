package Strings.ClassWork;

public class LowerUpperCase {
    public static void main(String[] args) {
        String s = "Raghav garg";
//        s.toLowerCase(); // will do nothing
        s = s.toLowerCase();
        System.out.println(s);
//        s.toUpperCase(); // will do nothing
        System.out.println(s.toUpperCase());

        String a = "abc";
        String b = "xyz";
        a.concat(b); // will do nothing
        a = a.concat(b);
        System.out.println(a);

        String z = "";
        System.out.println(z.length());
    }
}
