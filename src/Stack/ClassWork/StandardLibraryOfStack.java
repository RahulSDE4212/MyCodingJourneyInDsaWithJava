/*
    Get() method:         T.C       S.C
       Array              O(1)      O(1)
       Linked list        O(n)      O(1)
       Stack              O(1)      O(1)
* */


package Stack.ClassWork;
import java.util.Stack;
public class StandardLibraryOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        //System.out.println(st.peek());
        System.out.println(st);
        //System.out.println(st.pop());
        System.out.println(st);
    }
}
