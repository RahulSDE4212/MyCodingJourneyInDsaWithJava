package LinkedList.ExtraQuestions;

public class L876_MiddleOfTheLInkedList {
    public static Node middleNode(Node head){
        int length = 0; // will tell how many nodes are present in the linked list
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        int mid = length/2 + 1; // middle node
        temp = head;
        for(int i=1;i<=mid-1;i++){
            temp = temp.next;
        }
        return temp;

    }
    public static Node middleNode2(Node head){
        // slow and fast pointer approach
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(70);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.display();
        list.insertAtHead(60);
        list.display();
        Node mid = middleNode2(list.head);
        System.out.println(mid.val);
    }
}
