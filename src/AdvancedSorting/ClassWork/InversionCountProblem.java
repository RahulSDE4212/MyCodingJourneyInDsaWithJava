package AdvancedSorting.ClassWork;
import java.util.*;
public class InversionCountProblem {
    static int count;
    public static int countInversion(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]) count++;
            }
        }
        return count;
    }
    public static void inversion(int[] a, int[] b){
        int i=0, j = 0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count += a.length-i;
                j++;
            }
            else i++;
        }
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
    public static void merge(int[] a, int[] b, int[] arr){
        int i=0, j = 0, k = 0;
        int n = a.length;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) arr[k++] = a[i++];
            else {
                //count += (n-i);
                arr[k++] = b[j++];
            }
        }
        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        // base case
        if(n==1) return;
        // creating array 'a' and 'b' of size n and n-n/2 respectively.
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // copying and pasting array 'arr' element into 'a' and 'b'
        for(int i=0;i<a.length;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<b.length;i++){
            b[i] = arr[i+n/2];
        }
        // sorting array 'a' and 'b' by using a magic named recursion
        mergeSort(a);
        mergeSort(b);
        // counting inversion before merging array a and b
        inversion(a,b);
        // merging sorted array 'a' and 'b' into array 'arr'
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        print(arr);
        mergeSort(arr);
        System.out.println();
        print(arr);
        System.out.println();
        System.out.println(count);
    }
}
