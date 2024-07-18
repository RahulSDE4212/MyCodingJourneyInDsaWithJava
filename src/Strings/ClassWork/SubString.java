package Strings.ClassWork;

public class SubString {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.substring(3));
        // print 3 and aage wala indices ke character
        System.out.println(s.substring(1,4));
        String v = s.substring(1,3);
        System.out.println(v);
    }
}
