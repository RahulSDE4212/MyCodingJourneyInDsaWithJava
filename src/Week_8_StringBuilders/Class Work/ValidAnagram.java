package Week_8_StringBuilders;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        char[] sb = t.toCharArray();
        Arrays.sort(sb);
        System.out.println(sb);
        System.out.println();


    }
}
