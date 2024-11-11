package Stack.ClassWork;
import java.util.*;
public class ReverseStackRecursively {
    public static void reverseRec(Stack<Integer> st,Stack<Integer> temp){
        /*
            Time Complexity  : O(n)
            Space Complexity : O(n)
        */
        if(st.size()==0) return;
        temp.push(st.pop());
        reverseRec(st,temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        reverseRec(st,temp);
        System.out.println(temp);
    }
}
