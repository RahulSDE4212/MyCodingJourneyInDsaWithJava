package Week_8_StringBuilders;
import java.util.*;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int i = 0, j = sb.length()-1;
        while(i<j){
            char ch = sb.charAt(i);
            char dh = sb.charAt(j);
            sb.setCharAt(i,dh);
            sb.setCharAt(j,ch);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
