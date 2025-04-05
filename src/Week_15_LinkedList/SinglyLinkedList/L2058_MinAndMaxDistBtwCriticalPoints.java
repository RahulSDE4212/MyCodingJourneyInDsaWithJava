package Week_15_LinkedList.SinglyLinkedList;

import java.util.Arrays;

public class L2058_MinAndMaxDistBtwCriticalPoints {
    public static int[] nodesBetweenCriticalPoints(Node head) {
        Node l = head;
        Node m = head.next;
        Node r = head.next.next;
        int idx = 1;
        int first = -1, last = -1;
        int[] ans = new int[2];
        ans[0] = -1; ans[1] = -1;
        int minDistance = Integer.MAX_VALUE;
        while(r != null){
            if((m.val>l.val && m.val>r.val) || (m.val<l.val && m.val<r.val)){ // critical points
                if(first == -1){
                    first = idx;
                }
                if(last != -1){ // to find minimum distance between two critical points
                    int distance = idx-last;
                    minDistance = Math.min(distance,minDistance);
                }
                last = idx;
            }
            idx++;
            l = l.next;
            m = m.next;
            r = r.next;
        }
        if(first==last) return ans;
        int maxDistance = last - first; // maximum distance between two critical points
        ans[0] = minDistance;
        ans[1] = maxDistance;
        return ans;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(5);
        list.insertAtTail(3);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(5);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.display();
        int[] ans = nodesBetweenCriticalPoints(list.head);
        System.out.println(Arrays.toString(ans));
    }
}
