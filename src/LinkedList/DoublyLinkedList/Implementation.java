package LinkedList.DoublyLinkedList;
class DLL{
    Node tail;
    Node head;
    int size;
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println(size);
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(size==0){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        if(size==0){
            insertAtTail(val);
            return;
        }
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        head = temp;
        size++;
    }
    void insertAtIndex(int idx,int val) throws Error{
        if(idx<0 || idx>size) throw new Error("bhaang kha rakha hai kya!!!!");
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp.prev;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }
    void deleteAtHead() throws Error{
        if(head==null) {
            throw new Error("list is empty");
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail() throws Error{
        if(head==null) {
            throw new Error("list is empty");
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void deleteAtIndex(int idx) throws Error{
        if(idx<0 || idx>=size){
            throw new Error("invalid idx!!!");
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        Node x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        Node y = x.next.next;
        x.next = y;
        y.prev = x;
        size--;
    }
    int get(int idx) throws Error{
        if(head==null) throw new Error("list is empty");
        if(idx==0) return head.val;
        if(idx==size-1) return tail.val;
        Node x = head;
        for(int i=1;i<=idx;i++){
            x = x.next;
        }
        return x.val;
    }
    void set(int idx,int val) throws Error{
        if(head==null) throw new Error("list is empty");
        if(idx==0){
            head.val = val;
            return;
        }
        if(idx==size-1){
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
        DLL list = new DLL();
        list.display();
        list.insertAtHead(60);
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.insertAtHead(50);
        list.display();
        list.insertAtIndex(3,100);
        list.display();
        list.deleteAtHead();
        list.display();
        list.size();
        list.deleteAtTail();
        list.display();
        list.size();
        System.out.println(list.get(2));
        list.set(2,500);
        list.display();
    }

}
