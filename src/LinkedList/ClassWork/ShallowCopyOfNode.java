package LinkedList.ClassWork;

public class ShallowCopyOfNode {
    public static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a);
        Node temp = a; // shallow copy of node a. both a and temp are referring to same node
        System.out.println(temp);
        Node b = new Node(100); // deep copy of the node a. here new node b is created.
        System.out.println(b);

    }
}
