package Week_15_LinkedList.ClassWork;

public class ReverseLinkedList {
    public static Node reverse(Node head){
        /*
            Time complexity : O(n)
            Space complexity : O(1)
            ALGORITHM:
                1. First create three reference varaibles (previous,current,next)
                2. in every iteration, you need to perform three basic steps.
                    -> current ko previous se join karo.
                    -> previous = current
                    -> current = next
                3. follow the above steps till current reaches null.
                4. then return the previous.

        */
        Node current = head;
        Node next = null;
        Node previous = null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public static Node reverseList(Node head){
        // base case
        if(head == null || head.next == null) return head;
        Node a = head.next;
        Node newHead = reverse(a);
        a.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.insertAtTail(55);
        list.display();
        list.head = reverseList(list.head);
        list.display();
    }
}
