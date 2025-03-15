package Week_8_StringBuilders;
import java.util.*;
public class IsomorphicString {
    public static boolean isomorphic(String s, String t){
        char[] frequency = new char[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int idx = (int)(ch)-97;
            if(frequency[idx]=='\0') frequency[idx] = t.charAt(i);
            else {
                if(frequency[idx]!=t.charAt(i)) return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.nextLine();
        System.out.print("Enter the second string: ");
        String t = sc.nextLine();
        boolean bool = isomorphic(s,t);
        System.out.println(bool);


    }
}
