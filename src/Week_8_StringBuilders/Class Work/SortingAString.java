package Week_8_StringBuilders;
import java.util.*;
public class SortingAString {
    public static void main(String[] args) {
        String s = "raghav";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        StringBuilder a = new StringBuilder("singh");
        char[] atc = a.toString().toCharArray();
        Arrays.sort(atc);
        System.out.println();
        System.out.println(atc);
    }
}
