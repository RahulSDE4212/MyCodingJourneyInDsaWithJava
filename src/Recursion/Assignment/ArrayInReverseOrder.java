package Recursion.Assignment;

public class ArrayInReverseOrder {
    public static void print(int[] arr, int idx){
        if(idx<0) return;
        System.out.print(arr[idx] + " ");
        print(arr,idx-1);
    }
    public static void main(String[] args) {
        int[] arr = {12,1,2,3,4,67,5,6,7,8,9};
        print(arr,arr.length-1);
    }
}
