package HeapsAndPriorityQueue.Heaps;

import java.util.PriorityQueue;

public class _14_MinimumCostToConnectAllRopes {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;
        for(int num : arr){
            pq.add(num);
        }

        while(pq.size() > 1){
            int x = pq.remove();
            int y = pq.remove();
            cost += (x + y);
            pq.add(x + y);
        }

        return cost;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        int cost = minCost(arr);
        System.out.println(cost);
    }
}
