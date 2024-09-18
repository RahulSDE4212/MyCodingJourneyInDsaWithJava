package Recursion.Assignment;

public class PrintIdxOfGivenElement {
    public static void print(int[] arr, int n, int idx){
        if(idx == arr.length){
            System.out.println(-1);
            return;
        }
        if(arr[idx] == n){
            System.out.println(n+" is present at the index " + idx);
            return;
        }
        print(arr,n,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {12,1,2,3,4,67,5,6,7,8,9};
        int n = 67;
        print(arr,n,0);
    }
}
