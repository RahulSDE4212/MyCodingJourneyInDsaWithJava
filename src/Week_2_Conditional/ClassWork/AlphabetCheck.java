package Week_2_Conditional;
import java.util.*;
public class AlphabetCheck {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.toLowerCase();
        char ch = str.charAt(0);
        if(str.length()>1) System.out.println("Pls enter only one character: ");
        else
        {
            int asciiOfCh = (int) ch;
            if( (asciiOfCh>=97 && asciiOfCh<=122))
            {
                if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch =='o' || ch=='u')
                    System.out.println("this is vowel");
                else System.out.println("this is consonant");
            }
            else
            {
                System.out.println("pls enter an alphabet: ");
            }
        }

    }
}
