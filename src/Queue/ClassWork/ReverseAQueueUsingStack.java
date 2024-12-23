package Queue.ClassWork;
import java.util.*;
public class ReverseAQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q);
        System.out.println("Reversing the Queue using stack:  ");

        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        System.out.println(q);

    }
}
