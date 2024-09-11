package LinkedList.ClassWork;

public class ShallowCopyOfANode {
    public static void displayNode(Node head){
        // temp is the reference variable which is pointing to the node head
        Node temp = head; // shallow copy of node head
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        a.next = b;
        Node c = new Node(30);
        b.next = c;
        Node d = new Node(40);
        c.next = d;
        Node e = new Node(50);
        d.next = e;
        displayNode(c);
    }
}
