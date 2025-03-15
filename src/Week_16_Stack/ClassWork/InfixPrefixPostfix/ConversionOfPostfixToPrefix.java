package Week_16_Stack.ClassWork.InfixPrefixPostfix;

import java.util.Stack;

public class ConversionOfPostfixToPrefix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> res = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                res.push("" + ch);
            }
            else{
                String v2 = res.pop();
                String v1 = res.pop();
                String ans = ch + v1 + v2;
                res.push(ans);
            }
        }
        System.out.println(res.peek());
    }
}
