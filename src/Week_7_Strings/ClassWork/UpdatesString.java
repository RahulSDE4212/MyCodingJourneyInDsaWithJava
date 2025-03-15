package Week_7_Strings.ClassWork;

import java.util.Scanner;

public class UpdatesString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String v ="";
        for(int i=0;i<s.length();i++){
            if(i%2==0) v += 'a';
            else v+= s.charAt(i);
        }
        System.out.println(v);
    }
}
