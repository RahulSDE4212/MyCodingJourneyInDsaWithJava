package Week_11_BinarySearch.ClassWork;

public class LowerBound {
    public static int lowerBound(int[] arr, int target){
        int n = arr.length;
    //    if(target>arr[n-1]) return n;
    //    if(target<arr[0]) return 0;
        int lo = 0, hi = n-1;
        int lb = n;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>=target) {
                hi = mid - 1;
                lb = Math.min(lb, mid);
            }
            else if(arr[mid]<target) lo = mid + 1;
        }
        return lb;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int target = 0;
        int lb = lowerBound(arr,target);
        System.out.println(lb);

    }
}
