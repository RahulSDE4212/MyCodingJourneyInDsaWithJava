package HeapsAndPriorityQueue.Heaps;
import java.util.*;
public class KthSmallestElementInAnArray {
    public static int kthSmallest(int[] arr, int k) {
        /* ************** Approach 1: ************************ */
//        Arrays.sort(arr);
//        return arr[k - 1];

        /* ************** Approach 2: ************************ */
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int i = 0; i < arr.length; i++){
//            pq.add(arr[i]);
//        }
//        for(int i = 1; i <= k - 1; i++){
//            pq.remove();
//        }
//        return pq.peek();

        /* ************** Approach 3: ************************ */
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
            if(pq.size() > k) pq.remove();
        }

        return pq.peek();

    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int ans = kthSmallest(arr, k);
        System.out.println(ans);
    }
}
