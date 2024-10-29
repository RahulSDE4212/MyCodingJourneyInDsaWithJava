package LinkedList.ClassWork;

public class L2130_TwinSum {
    public static Node reverse(Node head){
        Node pre = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
    public static int pairSum(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next!= null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node a = slow.next;
        Node newHead = reverse(a);
        Node temp1 = head;
        Node temp2 = newHead;
        int max = Integer.MIN_VALUE;
        while(temp1 != null && temp2 != null){
            int sum = temp1.val + temp2.val;
            max = Math.max(sum,max);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return max;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);

    }
}
