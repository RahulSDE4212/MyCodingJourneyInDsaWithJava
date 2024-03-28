package Strings;
import java.util.*;
public class VowelInString {
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='I' || ch=='i') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='U' || ch=='u') return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowel = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)==true){
                vowel++;
            }
        }
        System.out.println(vowel);
    }
}
