package Week_26_Greedy.Leetcode;

import java.util.PriorityQueue;

// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/description/

class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
        }

        while(k > 0){
            int num = pq.poll();
            pq.add(-1 * num);
            k--;
        }

        int sum = 0;
        while(!pq.isEmpty()){
            int num = pq.poll();
            sum += num;
        }

        return sum;
    }
}