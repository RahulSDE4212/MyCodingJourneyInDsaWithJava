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
    void insetAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
}
public class ImplementationOfLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.insetAtHead(50);
        list.display();
    }
}
