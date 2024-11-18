package StringBuilders;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){
                 ch = (char)(ascii + 32);
            }
            else if(ascii>=97 && ascii<=122){
                 ch = (char)(ascii - 32);
            }
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
