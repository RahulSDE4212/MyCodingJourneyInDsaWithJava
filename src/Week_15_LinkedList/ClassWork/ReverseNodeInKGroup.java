package Week_15_LinkedList.ClassWork;

public class ReverseNodeInKGroup {
    public static Node traverse(Node head){
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        return temp;
    }
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
    public static Node reverseKGroup(Node head, int k) {
        Boolean bool = true; // ye check karne ke liye ki head pass karke reverse karna hai ya phir a node pass karke
        Node temp = head;
        Node a = null;
        Node dummy = new Node(-100);
        Node tempD = dummy;
        int count = 1;
        while(temp!=null){
            if(count==k){ // yadi count k ke barabar ho gya to
                if(bool){ // yadi bool true hai maane head ko reverse karna hai
                    a = temp.next; // jis node pe khada hu us node ke next ka access hona chahiye taki uss node ke next ko null kar du.
                    temp.next = null; // uss node ke next ko null kiya hai
                    temp = a;
                    bool = false;
                    Node newHead = reverse(head);
                    tempD.next = newHead;
                    tempD = traverse(tempD);
                    count = 1;
                }
                else{ // head ko reverse nhi karna hai.
                    Node aux = temp.next;
                    temp.next = null;
                    Node newHead = reverse(a);
                    tempD.next = newHead;
                    tempD = traverse(tempD);
                    count = 1;
                    a = aux;
                    temp = aux;
                }
            }
            else{
                temp = temp.next;
                count++;
            }
        }
        tempD.next = a;
        return dummy.next;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        int k = 2;
        list.head = reverseKGroup(list.head,k);
        list.display();
    }
}
