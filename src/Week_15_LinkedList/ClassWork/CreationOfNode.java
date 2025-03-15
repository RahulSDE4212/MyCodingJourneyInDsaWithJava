package Week_15_LinkedList.ClassWork;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class CreationOfNode {
    public static void print(Node temp) {
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void printRec(Node temp){
        if(temp==null) return;
        System.out.println(temp.val);
        printRec(temp.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        printRec(c);
    }
}
