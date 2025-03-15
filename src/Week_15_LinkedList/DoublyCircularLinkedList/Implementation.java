package Week_15_LinkedList.DoublyCircularLinkedList;

class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}
class DCLL{
    Node head;
    Node tail;
    int size;
    void display(){
        Node temp = head;
        while(true){
            if(temp==null) break;
            System.out.print(temp.val+" ");
            if(temp==tail)break;
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println(size);
    }
    void insertAtTail(int val){
        if(head==null){
            insertAtHead(val);
            return;
        }
        Node x = tail;
        Node newNode = new Node(val);
        tail = newNode;
        x.next = tail;
        tail.prev = x;
        tail.next = head; head.prev = tail;
        size++;
    }
    void insertAtHead(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = tail = newNode;
            tail.next = head; head.prev = tail;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail.next = head; head.prev = tail;
        }
        size++;
    }
    void insert(int idx,int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        Node x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        Node y = x.next;
        x.next = newNode; newNode.prev = x;
        y.prev = newNode; newNode.next = y;
        size++;
    }
    void deleteAtHead() throws Error{
        if(head==null) throw new Error("kya kar rha hai bhai ");
        if(size == 1) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        tail.next = head; head.prev = tail;
        size--;
    }
    void deleteAtTail() throws Error{
        if(head == null ) throw new Error("kya kar rha hai bhai ");
        if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = head; head.prev = tail;
        size--;
    }
    void delete(int idx){
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx == size-1){
            deleteAtTail();
            return;
        }
        Node x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        Node y = x.next.next;
        x.next = y; y.prev = x;
        size--;
    }
    int get(int idx){
        if(idx==0){
            return head.val;
        }
        if(idx == size-1) return tail.val;
        Node x = head;
        for(int i=1;i<=idx;i++){
            x = x.next;
        }
        return x.val;
    }
    void set(int idx, int val){
        if(idx == 0) {
            head.val = val;
            return;
        }
        if(idx == size-1){
            tail.val = val;
            return;
        }
        Node x = head;
        for(int i=1;i<=idx;i++){
            x = x.next;
        }
        x.val = val;
    }
}
public class Implementation {
    public static void main(String[] args) {
        DCLL list = new DCLL();
        list.insertAtTail(5);
        list.insertAtTail(10);
        list.insertAtTail(15);
        list.insertAtTail(20);
        list.insertAtHead(25);
        list.insert(2,30);
        list.display();
        list.delete(2);
        list.display();
        list.size();
        list.set(2,1000);
        list.display();
        list.size();
        System.out.println(list.head);
        System.out.println(list.tail);
    }
}
