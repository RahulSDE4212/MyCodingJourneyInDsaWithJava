package Week_26_Greedy.ClassWork;

import java.nio.DoubleBuffer;
import java.util.Collections;
import java.util.PriorityQueue;

public class _1_FractionalKnapsack {
    static class Triplet implements Comparable<Triplet> {
        int profit;
        int weight;
        double ratio;

        Triplet(int profit, int weight, double ratio){
            this.profit = profit;
            this.weight = weight;
            this.ratio = ratio;
        }

        public int compareTo(Triplet t){
            return Double.compare(t.ratio, this.ratio);
        }
    }
    public static double fractionalKnapsack(int[] profits, int[] weights, int W) {
        // code here
        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        // ek ek kar ke daalo pq me
        for(int i = 0; i < profits.length; i++){
            Triplet t = new Triplet(profits[i], weights[i], (double) (profits[i] / (weights[i] * 1.0)));
            pq.offer(t);
        }

        // check karo ki bag ki size bada hai kya abhi ke weight se
        double ans = 0.0;
        while(!pq.isEmpty()){
            Triplet t = pq.poll();
            int profit = t.profit;
            int weight = t.weight;
            double ratio = t.ratio;
            if(weight <= W){
                ans += profit;
                W -= weight;
            }
            else{
                ans += W * ratio;
                break;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] profits = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
        // profit = 60 -> weight = 40
        // profit = 60 + 100 = 160 -> weight = 20
        // profit =

        System.out.println(fractionalKnapsack(profits, weights, W));
    }
}
