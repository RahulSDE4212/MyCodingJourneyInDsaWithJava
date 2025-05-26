package Week_23_SlidingWindow.ExtraQuestion;
import java.util.*;
public class _4_FirstNegativeIntegerInEveryWindowOfSizeK {
    public static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int n = arr.length;

        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while(j < n){
            if(arr[j] < 0){
                q.offer(arr[j]);
            }

            if(j - i +  1 == k){
                if(!q.isEmpty()) result.add(q.peek());
                else result.add(0);

                if(arr[i] < 0){
                    q.remove();
                }
                i++;
            }

            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-8, 2, 6, -6, 7, 8};
        int k = 3;

        List<Integer> ans = firstNegInt(arr, k);
        System.out.println(ans);
    }
}
