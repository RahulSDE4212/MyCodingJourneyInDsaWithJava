package HeapsAndPriorityQueue.Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class KMostFrequentElement {
    public static class Pair implements Comparable<Pair>{
        int key;
        int val;
        Pair(int key, int val){
            this.key = key;
            this.val = val;
        }
        public int compareTo(Pair p){
            if(this.val == p.val) return this.key - p.key;
            return this.val - p.val;
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int key : map.keySet()) {
            pq.add(new Pair(key,map.get(key)));
            if(pq.size() > k) pq.poll();
        }
        int[] finalAns = new int[k];
        int ind = 0;
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            finalAns[ind++] = p.key;
        }
        return finalAns;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = topKFrequent(arr, k);
    }
}
