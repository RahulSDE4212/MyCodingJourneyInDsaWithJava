package AdvancedSorting.ClassWork;
import java.util.*;
public class KthSmallestElement {
    static int ans;
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int low, int high, int k){
        int pivot = arr[low]; // first element as pivot element
        int pivotIdx = low;// pivotidx
        int smallerCount = 0;
        for(int i =low+1; i<=high;i++){
            if(arr[i]<pivot) smallerCount++;
        }
        int requiredIdx = low + smallerCount; // pivot ka correct idx sorted array me
        //System.out.println(requiredIdx);
        swap(arr,requiredIdx,pivotIdx);
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
    public static void quickSelect(int[] arr, int low, int high, int k){
        // base
        if(low>high) return;
        // partition
        int idx = partition(arr,low,high,k);
        if(idx==k-1){ // if pivot element ka index k-1 hai iska matlab pivot hi kth smallest element hai
            ans = arr[idx];
            return;
        }
        if(k-1 < idx) quickSelect(arr,low,idx-1,k);
        else if(k-1 > idx) quickSelect(arr,idx+1,high,k);
    }
    public static void main(String[] args) {
        int[] arr = {8,4,1,3,5,9,6,12,2};
        ans = 0;
        print(arr); // printing before finding the kth smallest element
        int n = arr.length;
        int k = 3;
        quickSelect(arr,0,n-1,k);// function jo calculate the kth smallest element in the array
        System.out.println(ans);
    }
}
