package Week_17_Queue.ClassWork.Deque;
class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}
class Deque{
    Node head;
    Node tail;
    private int size = 0;
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertFront(int x){
        Node newNode = new Node(x);
        if(head == null) head = tail = newNode;
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    void insertRear(int x){
        Node newNode = new Node(x);
        if(head == null) head = tail = newNode;
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    void deleteFront() throws Error{
        if(head == null) throw new Error("Underflow Condition !!!");
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteRear() throws Error{
        if(head == null) throw new Error("Underflow Condition !!!");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    int getFront() throws Error{
        if(head == null) throw new Error("Underflow Condition !!!");
        return head.val;
    }
    int getRear() throws Error{
        if(head == null) throw new Error("Underflow Condition !!!");
        return tail.val;
    }
    boolean isEmpty(){
        return head == null;
    }
    int size(){
        return size;
    }
    void erase(){
        head = tail = null;
    }
}
public class ImplementationOfDeque {
    public static void main(String[] args) {
        Deque dq = new Deque();
        System.out.println(dq.size());
        dq.insertFront(20);
        dq.print();
        dq.insertFront(40);
        dq.print();
        System.out.println(dq.size());
        dq.insertRear(50);
        dq.print();
        System.out.println(dq.size());
        dq.deleteFront();
        dq.print();
        dq.deleteRear();
        dq.print();
        System.out.println(dq.size());
    }
}
