package Week_15_LinkedList.SinglyCircularLinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class SCLL{
    public Node head;
    int size;
    void size(){
        System.out.println(size);
    }
    void display(){
        Node x = head;
        while(true){
            if(x==null) break;
            System.out.print(x.val+ " ");
            if(x.next == head) break;
            x = x.next;
        }
        System.out.println();
    }
    void insertAtHead(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            head.next = newNode;
        }
        else{
            newNode.next = head;
            Node x = head;
            while(x.next!=head){
                x = x.next;
            }
            x.next = newNode;
            head = newNode;
        }
        size++;
    }
    void insertAtTail(int val){
        if(head==null){
            insertAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node x = head;
        while(x.next!=head){
            x = x.next;
        }
        x.next = newNode;
        x = x.next;
        x.next = head;
        size++;
    }
    void insertAtIndex(int idx,int val){
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
        newNode.next = x.next;
        x.next = newNode;
        size++;
    }
    void deleteAtHead() throws Error{
        if(size==0) throw new Error("list is empty ");
        if(size==1){
            head = null;
            size--;
            return;
        }
        Node x = head.next;
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = x;
        head = x;
        size--;

    }
    void deleteAtTail() throws Error{
        if(size == 0) throw new Error("list is empty");
        if(size==1){
            head = null;
            size--;
            return;
        }
        Node x = head;
        while(x.next.next!=head){
            x = x.next;
        }
        x.next = head;
        size--;
    }
    void delete(int idx){
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
        x.next = x.next.next;
        size--;
    }

}
public class Implementation {
    public static void main(String[] args) {
        SCLL list = new SCLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtHead(30);
        list.display();
        list.size();
        list.deleteAtHead();
        list.display();
        list.size();
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
        list.size();
        list.insertAtIndex(2,50);
        list.display();
        list.size();
        list.deleteAtTail();
        list.display();
        list.size();
        list.delete(2);
        list.display();
        list.size();

    }
}
