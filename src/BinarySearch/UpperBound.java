package BinarySearch;

public class UpperBound {
    public static int upperBound(int[] arr, int target){
        int n = arr.length;
        //    if(target>arr[n-1]) return n;
        //    if(target<arr[0]) return 0;
        int lo = 0, hi = n-1;
        int ub = n;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>target) {
                hi = mid - 1;
                ub = Math.min(ub, mid);
            }
            else lo = mid + 1;
        }
        return ub;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int target = 80;
        int ub = upperBound(arr,target);
        System.out.println(ub);
    }
}
