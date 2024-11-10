package Stack.ClassWork;

import java.util.Stack;
/*
    Time Complexity: O(n)
    Space Complexity: O(n) 
*/
public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Stack<Integer> reverseStack = new Stack<>();
        while(!st.isEmpty()){
//            int elem = st.pop();
//            reverseStack.push(elem);
            reverseStack.push(st.pop());

        }
        System.out.println(reverseStack);
    }
}
