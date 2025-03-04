package HeapsAndPriorityQueue.Heaps;
import java.util.*;
public class _13_LastStoneWeight {
    public static class Pair implements Comparable<Pair>{
        int key;
        int ind;
        Pair(int key, int ind){
            this.key = key;
            this.ind = ind;
        }
        public int CompareTo(Pair p){
            if(p.key == this.key) return this.ind - p.ind;
            return this.key - p.key;
        }

        public int compareTo(Pair o) {
            if(this.key == o.key) return this.ind - o.ind;
            return this.key - o.key;
        }
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());

        for(int i = 0; i < stones.length; i++){
            int stone = stones[i];
            pq.add(new Pair(stone, i));
        }

        while(pq.size() > 1){
            Pair largestNum = pq.poll();
            Pair secondLargest = pq.poll();
            int abs = Math.abs(largestNum.key - secondLargest.key);
            pq.add(new Pair(abs, secondLargest.ind));
        }

        return pq.peek().key;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        int ans = lastStoneWeight(arr);
        System.out.println(ans);
    }
}
