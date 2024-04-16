package Leetcode;

public class Leetcode402RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        StringBuilder s = new StringBuilder();
        if(k==1){
            for(int i = 1;i<num.length();i++){ // time complexity = O(n)
                s.append(num.charAt(i));
            }
        }
        else {
            int maxNumber = (int) (num.charAt(0));
            int j = 0;
            for (int i = 1; i <= num.length() - k; i++) {
                char ch = num.charAt(i);
                int ascii = (int) ch;
                if (ascii > maxNumber) {
                    j = i;
                    maxNumber = ascii;
                }
            }
            for (int i = 0; i < j; i++) {
                s.append(num.charAt(i));
            }
            for (int i = j + k; i < num.length(); i++) {
                s.append(num.charAt(i));
            }
        }
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '0') s.deleteCharAt(i);
            else break;
        }
        if(s.isEmpty()) return "0";
        String t = s.toString();
        return t;
    }

    public static void main(String[] args) {
        String s = "10200";
        String t = removeKdigits(s,1);
        System.out.println(t);
    }
}
