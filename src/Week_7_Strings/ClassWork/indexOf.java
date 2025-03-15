package Week_7_Strings.ClassWork;

public class indexOf {
    public static void main(String[] args) {
        String s = "Raghav Garg";
        System.out.println(s.indexOf('a')); // return the index of the specified character
        System.out.println(s.lastIndexOf('a')); // return the last index of the specified character

//        String a = "abc";
//        String b = "dbc";
        String a = "abcggg";
        String b = "abc";
        System.out.println(a.compareTo(b));

        String c = "Physics wallah skills";
        System.out.println(c.contains("allaw"));
        System.out.println(c.startsWith("phy"));
        System.out.println(c.endsWith("lls"));
        System.out.println();


    }
}
