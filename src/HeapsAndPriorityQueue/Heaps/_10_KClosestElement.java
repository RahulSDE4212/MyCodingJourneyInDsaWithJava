package HeapsAndPriorityQueue.Heaps;
import java.util.*;
public class _10_KClosestElement {
    public static class Pair implements Comparable<Pair>{
        int dist;
        int ele;
        Pair(int ele, int dist){
            this.ele = ele;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair pq) {
            if(this.dist == pq.dist) return this.ele - pq.ele;
            return this.dist - pq.dist;
        }
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            int dist = Math.abs(arr[i] - x);
            pq.add(new Pair(arr[i], dist));
            if(pq.size() > k) pq.remove(pq.peek());
        }

        while(!pq.isEmpty()){
            ans.add(pq.peek().ele);
            pq.remove();
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x = 3, k = 4;
        List<Integer> ans = findClosestElements(arr, k, x);
        System.out.println(ans);
    }
}
