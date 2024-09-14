package LinkedList.ExtraQuestions;

public class L876_MiddleOfTheLInkedList {
    public static Node rightMiddleNode(Node head){
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
    public static Node rightMiddleNode2(Node head){
        // slow and fast pointer approach
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node leftMiddleNode(Node head) throws Error{
        Node slow = head;
        Node fast = head;
        if(head==null) {
            throw new Error("list is empty !!!!");
        }
        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(70);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.display();
        Node aux = leftMiddleNode(list.head);
        System.out.println(aux.val);
    }
}
