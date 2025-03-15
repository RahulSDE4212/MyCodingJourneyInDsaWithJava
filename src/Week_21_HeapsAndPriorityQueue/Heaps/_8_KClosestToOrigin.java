package Week_21_HeapsAndPriorityQueue.Heaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class _8_KClosestToOrigin {
    public static class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;
        Triplet(int d, int x, int y){
            this.d = d;
            this.x = x;
            this.y = y;
        }
        public int compareTo(Triplet t){
            return this.d - t.d;
        }
    }
    public static class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static  int[][] kClosest2(int[][] points, int k) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Double, Pair> map = new HashMap<>();

        for(int i = 0; i < points.length; i++){
            int x = points[i][0], y = points[i][1];
            double pow = Math.pow(x, 2) + Math.pow(y, 2);
            double dist = Math.sqrt(pow);
            if(map.containsKey(dist)){
                dist += i * 0.000000000001;
                map.put(dist, new Pair(x, y));
            }
            else{
                map.put(dist, new Pair(x, y));
            }
            pq.add(dist);
            if(pq.size() > k) pq.remove();
        }

        int[][] finalAns = new int[k][2];
        for(int i = 0; i < k; i++){
            double dist = pq.poll();
            Pair pt = map.get(dist);
            finalAns[i][0] = pt.x;
            finalAns[i][1] = pt.y;
        }

        return finalAns;
    }
    public static int[][] kClosest(int[][] points, int k){
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < points.length; i++){
            int x = points[i][0], y = points[i][1];
            int d = x*x + y*y;
            pq.add(new Triplet(d, x, y));
            if(pq.size() > k) pq.remove();
        }

        int[][] finalAns = new int[k][2];
        for(int i = 0; i < k; i++){
            Triplet t = pq.poll();
            finalAns[i][0] = t.x;
            finalAns[i][1] = t.y;
        }

        return finalAns;
    }
    public static void main(String[] args) {
        int[][] points = {{1,3},{2,-2}};
        int k = 1;
        int[][] ans = kClosest(points, k);
    }
}
