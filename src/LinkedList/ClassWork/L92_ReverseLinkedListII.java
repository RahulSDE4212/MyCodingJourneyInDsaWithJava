package LinkedList.ClassWork;

public class L92_ReverseLinkedListII {
    public static void reverse(Node b){
        Node pre = null;
        Node curr = b;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
    }
    public static Node reverseBetween(Node head, int left, int right) {
        /* ******************* Method-1 *************************
            -> Time complexity : O(n)
            -> Space complexity : O(1)
            -> two pass approach
        * */
        Node a = null;
        Node b = null;
        Node c = null;
        Node d = null;
        int pos = 1;
        Node temp = head;
        while(temp!=null){
            if(pos==left-1) a = temp;
            if(pos==left) b = temp;
            if(pos==right) c = temp;
            if(pos==right+1) d = temp;
            pos++;
            temp = temp.next;
        }
        if(a!=null) a.next = null;
        c.next =null;
        reverse(b);
        if(a!=null) a.next = c;
        b.next = d;
        if(a!=null) return head;
        return c;
    }
    public static Node reverseBetween2(Node head, int left, int right) {
        /*
            ******************** Method - 2 **********************
            *   -> time complexity: O(n)
            *   -> space complexity: O(1)
            *   -> one pass approach.
        */
        // if(head == null || head.next==null) return head;
        Node dummy = new Node(-1);
        dummy.next = head;
        Node temp = dummy;
        for(int i=1;i<=left-1;i++){
            temp = temp.next;
        }
        Node pre = null;
        Node curr = temp.next;
        Node next = null;
        for(int i=1;i<=right-left+1;i++){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        temp.next.next = curr;
        temp.next = pre;
        return dummy.next;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        int left = 2;
        int right = 5;
        list.display();
        list.head = reverseBetween(list.head,left,right);
        list.display();

    }
}
