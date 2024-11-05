package LinkedList.ClassWork;

public class L1669_MergeInBtwLinkedList {
    public static Node mergeInBetween(Node list1, int a, int b, Node list2) {
        int idx = 0;
        Node start = null;
        Node end = null;
        Node temp = list1;
        while(temp!=null){
            if(idx==a-1) start = temp;
            if(idx==b+1) {
                end = temp;
                break;
            }
            idx++;
            temp = temp.next;
        }
        start.next = list2;
        Node temp2 = list2;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = end;
        return list1;
    }
    public static void main(String[] args) {
        SLL list1 = new SLL();
        list1.insertAtTail(10);
        list1.insertAtTail(1);
        list1.insertAtTail(13);
        list1.insertAtTail(6);
        list1.insertAtTail(9);
        list1.insertAtTail(5);
        SLL list2 = new SLL();
        list2.insertAtTail(100000);
        list2.insertAtTail(100001);
        list2.insertAtTail(100002);
        list1.head = mergeInBetween(list1.head,3,4,list2.head);
        list1.display();
    }
}
