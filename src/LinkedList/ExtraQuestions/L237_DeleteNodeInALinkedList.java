package LinkedList.ExtraQuestions;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class SLL{
    public Node head;
    private Node tail;
    private int size;
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) {
            head = tail = temp;
            size++;
            return;
        }
        temp.next = head;
        head = temp;
        size++;
    }
    void insertAtTail(int val){
        if(head==null) {
            insertAtHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }
    void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void deleteNode(Node temp){
        temp.val = temp.next.val;
        temp.next = temp.next.next;
    }

}
public class L237_DeleteNodeInALinkedList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.display();
        Node temp = list.head;
        for(int i=1;i<=2;i++){
            temp = temp.next;
        }
        list.deleteNode(temp);
        list.display();
    }
}
