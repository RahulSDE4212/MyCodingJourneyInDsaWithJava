package LinkedList.ClassWork;
// creating our own data structure name SinglyLinkedList
class SLL{
    Node head; // which will refer to the starting node of Linked list
    Node tail; // which will refer to the ending node of linked list
    int size;
    void add(int val){ // function to add node in the linked list
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
}
public class ImplementationOfLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.add(10);
        list.display();
        list.size();
        list.add(20);
        list.display();
        list.size();
        list.add(30);
        list.display();
        list.add(40);
        list.display();
    }
}
