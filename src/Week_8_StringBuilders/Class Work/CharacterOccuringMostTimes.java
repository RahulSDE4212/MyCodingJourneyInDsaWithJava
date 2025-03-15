package Week_8_StringBuilders;
import java.util.*;
public class CharacterOccuringMostTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] frequency = new int[26];
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            int idx = (int)a - 97;
            frequency[idx]++;
        }
        //System.out.println(Arrays.toString(frequency));
        char ch = ' ';
        int max = Integer.MIN_VALUE;
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>max) {
                max = frequency[i];
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i]==max) System.out.print((char)(i+97) + " ");
        }

    }
}
