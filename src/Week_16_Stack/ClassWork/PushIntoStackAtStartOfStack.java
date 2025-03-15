package Week_16_Stack.ClassWork;
import java.util.*;
public class PushIntoStackAtStartOfStack {
    public static void pushAtStart(Stack<Integer> st, int x){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
    }
    public static void pushAtIndex(Stack<Integer> st, int idx, int x){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>=idx){
           temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Stack before pushing ");
        System.out.println(st);
        System.out.println("Enter the element that you want to push: ");
        int x = sc.nextInt();
        pushAtIndex(st,2,x);
        System.out.println("Stack after pushing ");
        System.out.println(st);
    }
}
