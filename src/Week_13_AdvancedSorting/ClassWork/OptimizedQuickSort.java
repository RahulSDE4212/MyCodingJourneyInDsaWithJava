package Week_13_AdvancedSorting.ClassWork;

public class OptimizedQuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int low, int high){
        int mid = (low+high)/2;
        // pivot element
        int pivot = arr[mid], pivotIdx = mid;
        // counting no of elements <= pivot
        int smallerCount = 0;
        for(int i=low;i<=high;i++){
            if(i==pivotIdx) continue;
            if(arr[i]<=pivot) smallerCount++;
        }
        int requiredIdx = low + smallerCount;
        // swapping pivotidx and required idx
        swap(arr,requiredIdx,pivotIdx);
        // partition
        int i = low, j = high;
        while(i<requiredIdx && j>requiredIdx){
            if(arr[i]<pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<pivot){
                swap(arr,i,j);
            }
        }
        return requiredIdx;
    }
    public static void quickSort(int[] arr, int low, int high){
        // base case
        if(low>=high) return;
        // partition
        int requiredIdx = partition(arr,low,high);
        // recursice call
        quickSort(arr,low,requiredIdx-1);
        quickSort(arr,requiredIdx+1,high);
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,4,3,1,2,5,7,6,9};
        int n = arr.length-1;
        // printing arr before sorting
        print(arr);
        // quick sort function called
        quickSort(arr,0,n);
        // printing arr after sorting
        System.out.println();
        print(arr);
    }
}
