package Week_15_LinkedList.SinglyLinkedList;
import java.util.*;
public class PalindromeLinkedList {
    public static boolean isPalindromeUsingArrayList(Node head){
        ArrayList<Integer> ans = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            ans.add(temp.val);
            temp = temp.next;
        }
        int i = 0, j = ans.size()-1;
        while(i<=j){
            if(ans.get(i)!=ans.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static boolean PalindromeUsingLLDeepCopy(Node head){
        Node head2 = new Node(head.val);
        Node temp2 = head2;
        Node temp1 = head.next;
        while(temp1!=null){
            Node aux = new Node(temp1.val);
            temp2.next = aux;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        // reversing the linked list head2
        Node pre = null;
        Node curr = head2;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head2 = pre;

        temp1 = head;
        temp2 = head2;
        while(temp1!=null){
            if(temp1.val != temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
    // ******************* Method- 3 *********************************
    // in this method we have just reversed the second half of the linked list.
    public static boolean Palindrome(Node head){
        if(head.next == null) return true;
        int length = 0;
        Node temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        int mid = (length-1) / 2;
        temp = head;
        for(int i=0;i<=mid;i++){
            temp = temp.next;
        }
        Node pre = null;
        Node curr = temp;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        temp = pre;
        Node temp1 = head;
        while(temp!=null){
            if(temp1.val != temp.val) return false;
            temp = temp.next;
            temp1 = temp1.next;
        }
        return true;

    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(20);
        list.insertAtTail(10);
        list.display();
        boolean bool = Palindrome(list.head);
        System.out.println(bool);
    }
}
