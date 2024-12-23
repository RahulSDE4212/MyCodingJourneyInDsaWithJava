package Queue.ClassWork;
import java.util.*;
public class FirstNegativeInEachWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = {0, -1, -2, 3, 4, -5, 6, 4, 7, -8};
        int k = 3;
        int n = arr.length;
        int[] ans = new int[n - k + 1];

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] < 0) q.add(i);
        }

        int i = 0;
        while(i <= n - k){
            while(!q.isEmpty() && q.peek() < i) q.poll();
            if(q.isEmpty() || q.peek() > i + k - 1) ans[i] = 0;
            else ans[i] = arr[q.peek()];
            i++;
        }

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
