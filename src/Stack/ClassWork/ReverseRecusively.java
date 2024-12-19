package Stack.ClassWork;
import java.util.*;
public class ReverseRecusively {
    public static void pushAtBottomRec(Stack<Integer> st, int val){
        // base case
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int x = st.pop();
        pushAtBottomRec(st,val);
        st.push(x);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int x = st.pop();
        reverse(st);
        pushAtBottomRec(st,x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
