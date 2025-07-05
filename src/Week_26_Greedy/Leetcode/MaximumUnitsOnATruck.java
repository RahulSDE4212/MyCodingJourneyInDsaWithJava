package Week_26_Greedy.Leetcode;
import java.util.*;

// https://leetcode.com/problems/maximum-units-on-a-truck/

class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int ans = 0;
        for(int[] boxtype : boxTypes){
            int profit = boxtype[1];
            int unit = boxtype[0];

            if(truckSize >= unit){
                ans += unit * profit;
                truckSize -= unit;
            }
            else{
                ans += truckSize * profit;
                truckSize = 0;
                break;
            }
        }

        return ans;
    }
}