package Week_11_BinarySearch.ClassWork;

public class FirstAndLastPosition {
    public static int firstPosition(int[] arr, int target){
        int lo = 0, hi = arr.length-1;
        int n = arr.length;
        int lb = n;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>=target) {
                hi = mid - 1;
                lb = Math.min(lb, mid);
            }
            else lo = mid + 1;
        }
        return lb;
    }
    public static int lastPosition(int[] arr, int target){
        int n = arr.length;
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
        return ub-1;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 0;
//        int fp = firstPosition(arr,target);
//        int lp = lastPosition(arr,target);

        int n = arr.length;
        int lo = 0,hi = n-1;
        int fp = -1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]==target){
                if(mid==0){
                    fp = mid;
                    break;
                }
                else if(arr[mid]==arr[mid-1]) hi = mid -1;
                else {
                    fp = mid;
                    break;
                }
            }
            else if(arr[mid]>target) hi = mid-1;
            else lo = mid + 1;
        }
        int lp = -1;
        lo= 0;
        hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]==target){
                if(mid==n-1){
                    lp = mid;
                    break;
                }
                else if(arr[mid]==arr[mid+1]) lo = mid + 1;
                else {
                    lp = mid;
                    break;
                }
            }
            else if(arr[mid]>target) hi = mid-1;
            else lo = mid + 1;
        }
        System.out.println("first position " + fp );
        System.out.println("last position " + lp );

    }
}
