package Stack.ClassWork;

import java.util.Stack;

public class DisplayStackRec {
    public static void revdisplayRec(Stack<Integer> st){
        if(st.isEmpty()) return; // base case
        int num = st.pop();
        System.out.print(num + " ");
        revdisplayRec(st);
        st.push(num);
    }
    public static void display(Stack<Integer> st, Stack<Integer> temp){
        while(!st.isEmpty()) {
            temp.push(st.pop());
        }

        while(!temp.isEmpty()){
            System.out.print(temp.peek() + " ");
            st.push(temp.pop());
        }
        System.out.println();
    }
    public static void displayRec(Stack<Integer> st){
        // base case
        if(st.isEmpty()) return;
        int num = st.pop();
        displayRec(st);
        System.out.print(num + " ");
        st.push(num);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        //revdisplayRec(st);
        //System.out.println();
        //display(st, new Stack<>());
        displayRec(st);
        System.out.println();
        System.out.println(st);
    }
}
