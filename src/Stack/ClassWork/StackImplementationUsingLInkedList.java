package Stack.ClassWork;
import java.util.*;
public class StackImplementationUsingLInkedList {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    static class Stack{
        private Node head;
        private int size = 0;
        void push(int x){
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
            size++;
        }
        int pop() throws Error{
            if(head == null) throw new Error("stack Underflow !!! ");
            int ele = head.val;
            head = head.next;
            size--;
            return ele;
        }
        int peek() throws Error{
            if(head == null) throw new Error("Stack Underflow !!! ");
            return head.val;
        }
        void display(){
            displayRev(head);
            System.out.println();
        }
        void displayRev(Node h){
            if(h == null) return;
            displayRev(h.next);
            System.out.print(h.val + " ");
        }
        boolean isEmpty(){
            return head == null;
        }
        void size(){
            System.out.println(size);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        //st.size();
        System.out.println(st.isEmpty());
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.size();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.size();
        System.out.println(st.isEmpty());

    }
}
