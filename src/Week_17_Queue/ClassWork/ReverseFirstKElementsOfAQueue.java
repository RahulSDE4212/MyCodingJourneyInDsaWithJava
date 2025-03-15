package Week_17_Queue.ClassWork;
import java.util.*;
public class ReverseFirstKElementsOfAQueue {
    public static void reverse(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i = 1 ; i <= k; i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i = 1; i <= n - k; i++){
            q.add(q.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        System.out.println("Reversing first k elements of a queue");
        reverse(q, 2);
        System.out.println(q);
    }
}
