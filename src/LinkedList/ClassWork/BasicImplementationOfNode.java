package LinkedList.ClassWork;
/*
    Creating a Node datatype
        -> This datatype is gonna store the value and the address of the next node.
*/
class Node{
    int val; // store the value
    Node next; // basically the node datatype is going to store the new node object in this field.
    Node(int val){
        this.val =  val;
    }
}
public class BasicImplementationOfNode {
    public static void main(String[] args) {
        Node a = new Node(10); //  node is created of value 10
        Node b = new Node(20); // node is created of  value 20
        a.next = b; // now the a.next contain the node b
        Node c = new Node(30); // node is created of  value 30
        // b.next contain the node c
        // a.next contain the node b whose next contain the node c
        b.next = c;
        Node d = new Node(40); // node is created of value 40
        c.next = d;
        Node e = new Node(50); // node is created of value 50
        d.next = e;


//        System.out.println(a); // this is going to print the address that reference variable a is pointing.
//        System.out.println(b); // this is going to print the address that reference variable b is pointing.
//        System.out.println(c); // this is going to print the address that reference variable c is pointing.
//        System.out.println(d); // this is going to print the address that reference variable d is pointing.
//        System.out.println(e); // this is going to print the address that reference variable e is pointing.


//        System.out.println(a.val);
//        System.out.println(a.next);
//        System.out.println(b.val);
//        System.out.println(b.next);
//        System.out.println(c.val);
//        System.out.println(c.next);
//        System.out.println(d.val);
//        System.out.println(d.next);
//        System.out.println(e.val);
//        System.out.println(e.next);

        // now printing the value of every node by using the first node
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
    }
}
