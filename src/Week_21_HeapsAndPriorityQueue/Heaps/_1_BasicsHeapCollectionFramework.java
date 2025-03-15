package Week_21_HeapsAndPriorityQueue.Heaps;
import java.util.PriorityQueue;
public class _1_BasicsHeapCollectionFramework {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2); // add an element in the heap.
        System.out.println(pq + " " + pq.peek()); // pq.peek() -> return element on the top of heap.
        pq.add(10);
        System.out.println(pq + " " + pq.peek());
        pq.add(1);
        System.out.println(pq + " " + pq.peek());
        pq.remove(); // pq.remove() -> remove the element present on the top of heap.
        System.out.println(pq + " " + pq.peek());
        pq.add(0);
        System.out.println(pq + " " + pq.peek());
        pq.add(-34);
        System.out.println(pq + " " + pq.peek());
    }
}
