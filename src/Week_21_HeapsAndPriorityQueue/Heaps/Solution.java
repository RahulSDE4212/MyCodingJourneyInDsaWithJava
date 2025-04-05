package Week_21_HeapsAndPriorityQueue.Heaps;
import java.util.*;
class Solution {
    public static class Triplet implements Comparable<Triplet>{
        int ele;
        int row;
        int col;
        Triplet(int ele, int row, int col){
            this.ele = ele;
            this.row = row;
            this.col = col;
        }
        public int compareTo(Triplet triplet){
            return this.ele - triplet.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int max = 0;

        for(int row = 0; row < nums.size(); row++){
            max = Math.max(max, nums.get(row).get(0));
            pq.offer(new Triplet(nums.get(row).get(0), row, 0));
        }

        int[] range = {0, Integer.MAX_VALUE};

        while(true){
            Triplet triplet = pq.remove();
            int row = triplet.row;
            int col = triplet.col;
            int ele = triplet.ele;
            int presentRange = max - ele;
            if(presentRange < range[1] - range[0]){
                range[0] = ele;
                range[1] = max;
            }
            pq.offer(new Triplet(nums.get(row).get(col + 1), row, col + 1));
            if(col + 1 >= nums.get(row).size()) break;
        }

        return range;
    }
}