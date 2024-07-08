package Leetcode.BinarySearch;
import java.util.*;
public class MinimizeMaxDistBetGasStation {
    public static long minimizeMaximumDistBtwGasStation(int[] arr, int k){
        /* ***************Brute Force ******************* */
        ArrayList<Integer> howMany = new ArrayList<>();
        for(int i = 0;i<arr.length-1;i++){
            howMany.add(i,0);
        }
        for(int gasStation = 1; gasStation<=k; gasStation++){
            long maxSection = -1;
            int maxInd = -1;
            for(int i=0;i<arr.length-1;i++){
                long diff = arr[i+1]-arr[i];
                long lengthSection = diff/(howMany.get(i)+1);
                if(lengthSection>maxSection) {
                    maxSection = lengthSection;
                    maxInd = i;
                }
            }
            howMany.set(maxInd,(howMany.get(maxInd)+1));
        }
        long maxDistBtwGas = -1;
        for(int i=0;i<arr.length-1;i++){
            long diff = arr[i+1] - arr[i];
            long sectionLength = diff / (howMany.get(i)+1);
            if(sectionLength>maxDistBtwGas){
                maxDistBtwGas = sectionLength;
            }
        }
        return maxDistBtwGas;
    }
    public static void main(String[] args){
        System.out.println("This is the hard-level question: ");
        int[] arr = {1,13,17,23};
        int k = 5;
        long ans = minimizeMaximumDistBtwGasStation(arr,k);
        System.out.println("The minimum dist is: " + ans);

    }
}
