package Queue.ClassWork.LinkedListImplementationOfQueue;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Queue{
    Node head;
    Node tail;
    private int size = 0;
    void add(int x){
        Node newNode = new Node(x);
        if(head == null) head = tail = newNode;
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    int remove() throws Error{
        if(head == null) throw new Error("Underflow Error !!! ");
        int ele = head.val;
        head = head.next;
        size--;
        return ele;
    }
    int poll() throws Error{
        if(head == null) throw new Error("Underflow Error !!! ");
        int ele = head.val;
        head = head.next;
        size--;
        return ele;
    }
    int peek() throws Error{
        if(head == null) throw new Error("underflow Condition!!!");
        return head.val;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return head == null;
    }
}
public class LinkedListImplementationOfQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.add(123);
        q.add(111);
        q.add(222);
        System.out.println(q.size());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
