package LinkedList.ClassWork;

import java.util.ArrayList;
import java.util.Arrays;

public class L725_SplitLinkedListInKPart {
    public static  int length(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static Node[] splitListToParts(Node head, int k) {
        ArrayList<Node> ans = new ArrayList<>();
        Node temp = head; // temp will traverse the full linked list
        int len = length(head); // len linked list ka length bata rha hai
        int size = len / k; // minimum itna size ka linked list hona chahiye
        int extra = len % k;
        int length = 1;
        while(temp!=null){
            if(length == 1) ans.add(temp);
            int s = size;
            if(extra > 0) s++;
            if(length==s){
                Node a = temp.next;
                length = 1;
                extra--;
                temp.next = null;
                temp = a;
            }
            else{
                length++;
                temp = temp.next;
            }
        }
        while(ans.size()<k){
            ans.add(null);
        }
        Node[] finalAns = new Node[ans.size()];
        for(int i=0;i<finalAns.length;i++){
            finalAns[i] = ans.get(i);
        }
        return finalAns;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(6);
        list.insertAtTail(7);
        list.insertAtTail(8);
        list.insertAtTail(9);
        list.insertAtTail(10);
        list.insertAtTail(11);
        int k = 3;
        Node[] ans = splitListToParts(list.head,k);

    }
}
