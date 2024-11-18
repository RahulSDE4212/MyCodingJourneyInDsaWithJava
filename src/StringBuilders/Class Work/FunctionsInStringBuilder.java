package StringBuilders;

public class FunctionsInStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Raghav");
        StringBuilder tb = new StringBuilder("Madhav");
        System.out.println(sb.compareTo(tb));
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
