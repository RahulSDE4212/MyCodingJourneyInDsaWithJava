package Stack.ClassWork;
import java.util.*;
public class InfixExpression {
    public static void main(String[] args) {
        String s = "9-5+3*4/6";
        System.out.println(s);
        Stack<Integer> number = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                number.push(ch - '0');
            }
            else{
                if(operator.isEmpty()) operator.push(ch);
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
