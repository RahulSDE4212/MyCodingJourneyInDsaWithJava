package Week_11_BinarySearch.ClassWork;

public class CapacityToShipPackagesWithinDDays {
    public static boolean isPossible(int mid,int[]arr,int d){
        int load = 0;
        int D =1;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]<=mid) load += arr[i];
            else {
                D++;
                load = arr[i];
            }
        }
        return D <= d;
    }
    public static int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx = Math.max(mx,arr[i]);
            sum += arr[i];
        }
        int lo = mx, hi = sum, minC = sum;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(isPossible(mid,arr,d)){
                minC = mid;
                hi = mid-1;
            }
            else lo = mid +1;
        }
        return minC;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,1,4};
        int days = 3;
        int capacity = shipWithinDays(arr,days);
        System.out.println(capacity);
    }
}
