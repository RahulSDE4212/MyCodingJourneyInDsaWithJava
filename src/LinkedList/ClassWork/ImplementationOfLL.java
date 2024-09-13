package LinkedList.ClassWork;
// creating our own data structure name SinglyLinkedList
class SLL{
    private Node head; // which will refer to the starting node of Linked list
    private Node tail; // which will refer to the ending node of linked list
    private int size;
    void insertAtTail(int val){ // function to add node in the linked list
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){ // function to display the node of the linked list
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("The length of the linked list : " + size);
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        Node temp = new Node(val);
        Node x = head;
        if(idx == 0) {
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid index ..... ");
            return;
        }
        // i need to traverse the linked list till index - 1
        // so i need to run the loop idx-1 times
        for(int i=0;i<idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
    }
    int get(int idx) throws Error{
        if(idx<0 || idx>=size) throw new Error("bhai error aa gya!!!!");
        if(idx==size-1) return tail.val;
        if(idx == 0) return head.val;
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val) throws Error{
        if(idx<0 || idx>=size) throw new Error("bhai kya kar rha hai index to sahi de!!!!!");
        if(idx==size-1){
            tail.val = val;
        }
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
}
public class ImplementationOfLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        //list.display();
        list.insertAtTail(40);
        //.display();
        list.insertAtHead(50);
        list.display();
        list.insert(2,100);
        list.display();
        list.insert(6,80);
        list.display();
        list.insert(0,2);
        list.display();
        list.insert(10,45);
        list.display();
        System.out.println(list.get(4));
        list.set(3,8);
        list.display();
    }
}
