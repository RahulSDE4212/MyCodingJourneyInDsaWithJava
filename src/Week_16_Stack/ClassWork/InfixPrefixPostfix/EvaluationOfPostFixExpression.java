package Week_16_Stack.ClassWork.InfixPrefixPostfix;

import java.util.*;

public class EvaluationOfPostFixExpression {
    public static void main(String[] args) {
        String s = "53+95324+*+-93*3/++";
        Stack<Integer> res = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                res.push(ch - '0');
            }
            else{
                int v2 = res.pop();
                int v1 = res.pop();
                if(ch == '+') res.push(v1 + v2);
                if(ch == '-') res.push(v1 - v2);
                if(ch == '*') res.push(v1 * v2);
                if(ch == '/') res.push(v1 / v2);
            }
        }
        System.out.println(res.peek());
    }
}
