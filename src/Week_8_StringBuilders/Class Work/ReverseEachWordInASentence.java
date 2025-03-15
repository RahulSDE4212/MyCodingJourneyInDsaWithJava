package Week_8_StringBuilders;
import java.util.*;
public class ReverseEachWordInASentence {
    public static void reverse(StringBuilder a, int i, int j){
        while(i<=j){
            char temp = a.charAt(i);
            a.setCharAt(i,a.charAt(j));
            a.setCharAt(j,temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.nextLine());
        System.out.println(a);
        int n = a.length();
        int i = 0, j = 0;
        while(j<n){
            if(a.charAt(j)!=' ') j++;
            else {
                reverse(a,i,j-1);
                while(a.charAt(j)==' ') j++;
                i = j;
            }
        }
        reverse(a,i,j-1);
        System.out.println(a);
    }
}
