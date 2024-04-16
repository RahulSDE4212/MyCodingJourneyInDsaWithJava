package Leetcode;
import java.util.*;
public class Ques6 {
    public static String convert(String s, int numRows) {
        List<List<Character>> l = new ArrayList<>(numRows);
        for(int i=0;i<numRows;i++){
            List<Character> ch = new ArrayList<>();
            l.add(ch);
        }
        int n = s.length();
        int i = 0;
        int row = 0;
        while(i<n) {
            if (row == 0) {
                while (row < numRows && i<n) {
                    l.get(row).add(s.charAt(i));
                    row++;
                    i++;
                }
                row -= 2;
            }
            else {
                l.get(row).add(s.charAt(i));
                row -= 1;
                i++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (List<Character> innerList : l) {
            for (char c : innerList) {
                stringBuilder.append(c);
            }
        }
        String result = stringBuilder.toString();
        return result;
    }
    public static void main(String[] args) {
        String s = "paypalishiring";
        String t = convert(s,3);
        System.out.println(t);
    }
}
