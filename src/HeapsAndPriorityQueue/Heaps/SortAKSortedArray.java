package HeapsAndPriorityQueue.Heaps;
import java.util.*;
public class SortAKSortedArray {
    public static void sort(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
            if(pq.size() > k) arr[index++] = pq.poll();
        }
        while(pq.size() != 0){
            arr[index++] = pq.poll();
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        System.out.println(Arrays.toString(arr));
        sort(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
