package LinkedList.DoublyLinkedList;
class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}
public class doublyLinkedListImplementation {
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printRev(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void printR(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        print(temp);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        e.next = f; f.prev = e;
        print(a);
        printRev(f);
        printR(c);
    }
}
