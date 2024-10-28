package LinkedList.ClassWork;
class SLL{
    Node head;
    Node tail;
    int size;
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            insertAtTail(val);
            return;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtIdx(int idx, int val) throws Error{
        Node temp = new Node(val);
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        if(idx<0 || idx>size){
            throw new Error("sahi index daal!!!");
        }
        Node x = head;// shallow copy
        for(int i=0;i<idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void size(){
        System.out.println("The size of the linked list is: " + size);
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx){
        Node x = head;
        for(int i=0;i<idx;i++){
            x = x.next;
        }
        return x.val;
    }
}
public class ImplementationOfLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.size();
        list.insertAtTail(10);
        list.display();
        list.size();
        list.insertAtTail(20);
        list.display();
        list.size();
        list.insertAtHead(30);
        list.display();
        list.insertAtIdx(2,40);
        list.display();
        list.insertAtIdx(1,50);
        list.display();
        list.insertAtIdx(5,60);
        list.display();
       // list.insertAtIdx(-1,100);
        System.out.println(list.get(2)); // 10


    }
}
