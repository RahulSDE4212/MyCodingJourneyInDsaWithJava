package BasicSorting;

public class DescendingOrderByBubbleSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap (int[] arr, int idx, int minidx){
        int temp = arr[idx];
        arr[idx] = arr[minidx];
        arr[minidx] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {12,11,10,1,2,3,4};
        int n = arr.length;
        print(arr);
        // method 1
//        for(int i=0;i<n-1;i++){
//            boolean bool = true;
//            for (int j = n-1; j > 0 ; j--) {
//                if(arr[j]>arr[j-1]) {
//                    swap(arr, j, j - 1);
//                    bool = false;
//                }
//            }
//            if(bool) break;
//        }

        // method 2
        for(int i=0;i<n-1;i++){
            boolean bool = true;
            for(int j=i;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                    bool = false;
                }
            }
            if(bool) break;
        }
        print(arr);
    }
}
