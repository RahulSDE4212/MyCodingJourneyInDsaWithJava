package Stack.ClassWork.InfixPrefixPostfix;

import java.util.Stack;

public class EvalutionOfPrefixExpression {
    public static void main(String[] args) {
        String s = "++53+-9+5*3+24/*933";
        Stack<Integer> res = new Stack<>();

        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                res.push(ch - '0');
            }
            else{
                int v1 = res.pop();
                int v2 = res.pop();
                if(ch == '+') res.push(v1 + v2);
                if(ch == '-') res.push(v1 - v2);
                if(ch == '*') res.push(v1 * v2);
                if(ch == '/') res.push(v1 / v2);
            }
        }
        System.out.println(res.peek());
    }
}
