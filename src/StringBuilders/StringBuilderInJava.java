package StringBuilders;

public class StringBuilderInJava {
    public static void main(String[] args) {
        //StringBuilder sb = "Raghav"; always declare stringbuilder using new keyboard
        StringBuilder sb = new StringBuilder("Raghav");
        System.out.println(sb);
        StringBuilder a = new StringBuilder("");// will create an empty string
        System.out.println(a.length());
        StringBuilder b = new StringBuilder();// will create an empy string
        System.out.println(b.length());
        StringBuilder c = new StringBuilder(10); // 10 is the capacity of the string
        System.out.println(c.length());
    }
}
