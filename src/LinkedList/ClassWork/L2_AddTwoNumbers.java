package LinkedList.ClassWork;

public class L2_AddTwoNumbers {
    public static  Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = l1;
        Node temp2 = l2;
        int carry = 0;
        while(temp1!=null || temp2!=null || carry!=0){
            int n1 = (temp1!=null) ? temp1.val:0;
            int n2 = (temp2!=null) ? temp2.val:0;
            int sum = n1 + n2 + carry;
            Node aux = new Node(sum%10);
            carry = sum / 10;
            temp.next = aux;
            temp = temp.next;
            if(temp1!=null) temp1 = temp1.next;
            if(temp2!=null) temp2 = temp2.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        SLL list1 = new SLL();
        list1.insertAtTail(1);
        list1.insertAtTail(2);
        list1.insertAtTail(3);

        SLL list2 = new SLL();
        list2.insertAtTail(1);
        list2.insertAtTail(2);
        list2.insertAtTail(3);

        SLL list3 = new SLL();
        list3.head = addTwoNumbers(list1.head, list2.head);
        list3.display();
    }
}
