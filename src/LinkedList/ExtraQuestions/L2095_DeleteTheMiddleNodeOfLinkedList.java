package LinkedList.ExtraQuestions;

import BasicSorting.NDistinctElement;

public class L2095_DeleteTheMiddleNodeOfLinkedList {
    public static int size(Node head){
        Node temp = head;
        int length = 0;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        return length;
    }
    public static Node deleteMiddleNode(Node head){
        int length = size(head);
        int mid = length/2 +1;
        Node temp = head;
        if(head.next==null){
            head = null;
            return head;
        }
        for(int i=1;i<mid-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static Node deleteMiddleNode2(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!= null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.display();
        deleteMiddleNode2(list.head);
        list.display();
    }
}
