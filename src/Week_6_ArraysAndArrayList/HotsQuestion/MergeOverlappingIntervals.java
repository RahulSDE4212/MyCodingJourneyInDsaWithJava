package Week_6_ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class MergeOverlappingIntervals {
    public static void sort(int[][] interval){
        int n = interval.length;
        for(int i=1;i<=n-1;i++){
            for(int j=0;j<n-i;j++){
                int num1 = interval[j][0];
                int num2 = interval[j+1][0];
                if(num2<num1) {
                    int[] temp = interval[j];
                    interval[j] = interval[j+1];
                    interval[j+1] = temp;
                }
            }
        }
    }
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<List<Integer>> ans = new ArrayList<>();
        int k = -1;
        for(int i=0;i<n;i++){
            if(!ans.isEmpty() && ans.get(k).get(1) >= intervals[i][0]){
                int num1 = ans.get(k).get(1);
                int num2 = intervals[i][0];
                ans.get(k).set(1,Math.max(num1,num2));
            }
            else{
                List<Integer> aux = new ArrayList<>();
                aux.add(intervals[i][0]);
                aux.add(intervals[i][1]);
                ans.add(aux);
                k++;
            }
        }
        int[][] arr = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            arr[i][0] = ans.get(i).get(0);
            arr[i][1] = ans.get(i).get(1);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] interval ={ {2,3},{4,5},{6,7},{8,9},{1,10}};
        sort(interval);
        int[][] arr = merge(interval);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
