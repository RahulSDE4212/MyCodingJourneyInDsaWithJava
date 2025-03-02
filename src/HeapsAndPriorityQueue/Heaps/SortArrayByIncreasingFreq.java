package HeapsAndPriorityQueue.Heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFreq {
    public static class Pair implements Comparable<Pair>{
        int key;
        int val;
        Pair(int key, int val){
            this.key = key;
            this.val = val;
        }
        public int compareTo(Pair P){
            if(this.val == P.val) return P.key - this.key;
            return this.val - P.val;
        }
    }
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        for(int key : map.keySet()){
            pq.add(new Pair(key, map.get(key)));
        }

        int ind = 0;
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int freq = p.val;
            for(int i = 0; i < freq; i++){
                nums[ind++] = p.key;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,3,2};
        int[] ans = frequencySort(nums);
        System.out.println(Arrays.toString(ans));
    }
}
