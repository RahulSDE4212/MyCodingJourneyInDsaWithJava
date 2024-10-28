package LinkedList.ClassWork;
import java.util.*;
public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head){
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
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(20);
        list.insertAtTail(10);
        list.display();
        boolean bool = isPalindrome(list.head);
        System.out.println(bool);
    }
}
