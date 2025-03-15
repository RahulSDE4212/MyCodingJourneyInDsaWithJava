package Week_11_BinarySearch.Leetcode;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean isPossbile(int[] stall, int dist, int cows){
        int count = cows-1;
        int idx = 0;
        for(int i=1;i<stall.length;i++){
            if((stall[i]-stall[idx]>=dist)){
                count--;
                idx = i;
            }
            if(count==0){
                break;
            }
        }
        return (count==0);
    }
    public static int maximum(int[] stall){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < stall.length; i++) {
            max = Math.max(stall[i],max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] stall = {0,3,4,7,10,9};
        Arrays.sort(stall);
        int cows = 4;
        int max = maximum(stall);
        int maxPossible = Integer.MIN_VALUE;
        /* *************** Linear Search Approach **************/
//        for(int i=1;i<=max;i++){
//            boolean bool = isPossbile(stall,i,cows);
//            if(bool){
//                maxPossible = Math.max(i,maxPossible);
//            }
//        }

        /* **************** Binary Search Approach ****************/
        int low = 1;
        int high = maximum(stall);
        while(low<=high){
            int mid = low + (high-low)/2;
            boolean bool = isPossbile(stall,mid,cows);
            if(bool){
                maxPossible = Math.max(mid,maxPossible);
                low = mid +1;
            }
            else high = mid -1;
        }
        System.out.println("the maximum minimum distance possible is: " + maxPossible);

    }
}
