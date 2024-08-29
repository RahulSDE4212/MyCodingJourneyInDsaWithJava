package ArraysAndArrayList.ClassWork;

import java.util.Scanner;
// time complexity : O(n)
// space complexity : O(1)
public class ReversingArrayUsingTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
