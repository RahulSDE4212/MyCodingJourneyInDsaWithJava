package HeapsAndPriorityQueue.Heaps;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
            if(pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int ans = findKthLargest(arr, k);
        System.out.println(ans);
    }
}
