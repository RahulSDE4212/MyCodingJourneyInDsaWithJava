package Week_8_StringBuilders;

public class StringBuilderPassingToMethod {
    public static void reverse(StringBuilder a ){
        a.append(12);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shyam");
        reverse(sb);
        System.out.println(sb);
    }
}
