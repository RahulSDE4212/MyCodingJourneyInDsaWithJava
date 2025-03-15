package Week_12_Recursion.HotsQuestion;
import java.util.*;
public class LetterCombination {
    static List<String> finalAns = new ArrayList<>();
    public static String letter(int num){
        switch(num){
            case 2: return "abc";
            case 3: return "def";
            case 4: return "ghi";
            case 5: return "jkl";
            case 6: return "mno";
            case 7: return "pqrs";
            case 8: return "tuv";
            case 9: return "wxyz";
        }
        return "0";
    }
    public static void lettercomb(ArrayList<String> ans){
        if(ans.size()==1){
            int i = 0;
            while(i<ans.get(0).length()){
                char ch = ans.get(0).charAt(i);
                finalAns.add(String.valueOf(ch));
                i++;
            }
        }
    }
    public static void main(String[] args) {
        String digits = "2";
        int i = 0;
        ArrayList<String> arr = new ArrayList<>();
        while(i<digits.length()){
            int num = digits.charAt(i)-'0';
            arr.add(letter(num));
            i++;
        }
        lettercomb(arr);
        System.out.println(finalAns);
    }
}
