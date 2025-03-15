package Week_15_LinkedList.ClassWork;
class NodeA{
    public int val;
    public NodeA next;
    public NodeA random;
    NodeA(int val){
        this.val = val;
    }

}
public class L138_CopyTheListWithRandomPointer {
    public static NodeA deepCopy(NodeA head){
        NodeA head2 = new NodeA(head.val);
        NodeA t = head2;
        NodeA temp = head.next;
        while(temp!=null){
            NodeA aux = new NodeA(temp.val);
            t.next = aux;
            t = t.next;
            temp = temp.next;
        }
        return head2;
    }
    public static void mergeLL(NodeA head, NodeA head2){
        NodeA t1 = head;
        NodeA t2 = head2;
        NodeA dummy = new NodeA(-100);
        NodeA temp = dummy;
        while(t1!=null && t2!=null) {
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;

            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }
    }
    public static NodeA copyRandomList(NodeA head) {
        if(head == null) return null;
        // step 1 : create deep copy without random connections.
        NodeA head2 = deepCopy(head);
        // step 2 : join these two linked list alternatively
        mergeLL(head,head2);
        // step 3 :  assign random pointers
        NodeA t1 = head;
        NodeA t2 = head2;
        while(t1!=null){
            if(t1.random == null) t2.random = null;
            else t2.random = t1.random.next;
            t1 = t2.next;
            if(t1!=null) t2 = t1.next;
        }
        // split these two linked list alternatively
        t1 = head;
        t2 = head2;
        while(t1!=null){
            t1.next = t2.next;
            t1 = t1.next;

            if(t1!=null) t2.next = t1.next;
            t2 = t2.next;
        }
        return head2;

    }

    public static void main(String[] args) {
        NodeA n1 = new NodeA(7);
        NodeA n2 = new NodeA(13);
        n1.next = n2;
        NodeA n3 = new NodeA(11);
        n3.next = n2;
        NodeA n4 = new NodeA(10);
        n4.next = n3;
        NodeA n5 = new NodeA(10);
        n5.next = n4;
        NodeA n6 = new NodeA(1);
        NodeA head = n1;
        head = copyRandomList(head);
    }
}
