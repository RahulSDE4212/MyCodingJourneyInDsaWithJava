package Week_16_Stack.ClassWork.InfixPrefixPostfix;

import java.util.Stack;

public class ConversionOfInfixToPostfix {
    public static void main(String[] args) {
        String s = "(5+3)+(9-(5+(3*(2+4)))+9*3/3)";
        Stack<String> pre = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                String res = "" + ch;
                pre.push(res);
            }
            else if(operator.isEmpty() || ch == '('  || operator.peek() == '('){
                operator.push(ch);
            }
            else{
                if(ch == ')'){
                    while(operator.peek() != '('){
                        String v2 = pre.pop();
                        String v1 = pre.pop();
                        char op = operator.pop();
                        String res = v1 + v2 + op;
                        pre.push(res);
                    }
                    operator.pop();
                }
                else if(ch == '+' || ch == '-'){
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    char op = operator.pop();
                    String res = v1 + v2 + op;
                    pre.push(res);
                    operator.push(ch);
                }
                else{
                    if(operator.peek() == '*' || operator.peek() == '/'){
                        String v2 = pre.pop();
                        String v1 = pre.pop();
                        char op = operator.pop();
                        String res = v1 + v2 + op;
                        pre.push(res);
                        operator.push(ch);
                    }
                    else operator.push(ch);
                }
            }
        }

        while(!operator.isEmpty()){
            String v2 = pre.pop();
            String v1 = pre.pop();
            char op = operator.pop();
            String res = v1 + v2 + op;
            pre.push(res);
        }

        System.out.println(pre.peek());
    }
}
