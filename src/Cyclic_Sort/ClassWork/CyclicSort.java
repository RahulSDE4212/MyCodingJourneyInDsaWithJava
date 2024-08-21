package Cyclic_Sort.ClassWork;
import java.util.*;
public class CyclicSort {
    public static void swap(int[] arr, int i, int j){
        // this function swaps two number
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for(int ele :arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1,0}; // array to be sorted
        int i = 0;
        print(arr);
        while(i<arr.length){
            int ele = arr[i]; // ith index pe pda hua number ko usi index pe daalo
            if(arr[i]==i) i++;
            else swap(arr,i,ele);
        }
        print(arr);
    }
}
