package Stack.ClassWork;

import java.util.*;

public class InfixExpressionWithBracket {
    public static void main(String[] args) {
        String str = "(5+3)+(9-(5+(3*(2+4)))+9*3/3)";
        Stack<Integer> number = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) number.push(ch - '0');
            else if(operator.isEmpty() || operator.peek()=='(' || ch == '('){
                operator.push(ch);
            }
            else{
                if(ch == ')'){
                    while(operator.peek() != '('){
                        int v2 = number.pop();
                        int v1 = number.pop();
                        if(operator.peek() == '+') number.push(v1 + v2);
                        if(operator.peek() == '-') number.push(v1 - v2);
                        if(operator.peek() == '*') number.push(v1 * v2);
                        if(operator.peek() == '/') number.push(v1 / v2);
                        operator.pop();
                    }
                    operator.pop();
                }
                else if(ch == '+' || ch == '-'){
                    int v2 = number.pop();
                    int v1 = number.pop();
                    if(operator.peek() == '+') number.push(v1 + v2);
                    if(operator.peek() == '-') number.push(v1 - v2);
                    if(operator.peek() == '*') number.push(v1 * v2);
                    if(operator.peek() == '/') number.push(v1 / v2);
                    operator.pop();
                    operator.push(ch);
                }
                else{
                    if(operator.peek() == '*' || operator.peek() == '/') {
                        int v2 = number.pop();
                        int v1 = number.pop();
                        if(operator.peek() == '*') number.push(v1 * v2);
                        if(operator.peek() == '/') number.push(v1 / v2);
                        operator.pop();
                        operator.push(ch);
                    }
                    else operator.push(ch);
                }
            }
        }
        while(!operator.isEmpty()){
            int v2 = number.pop();
            int v1 = number.pop();
            if(operator.peek() == '+') number.push(v1 + v2);
            if(operator.peek() == '-') number.push(v1 - v2);
            if(operator.peek() == '*') number.push(v1 * v2);
            if(operator.peek() == '/') number.push(v1 / v2);
            operator.pop();
        }

        System.out.println(number.peek());
    }
}
