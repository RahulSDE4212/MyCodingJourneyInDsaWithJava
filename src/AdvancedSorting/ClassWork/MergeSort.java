package AdvancedSorting.ClassWork;

public class MergeSort {
    public static void merge(int[] a,int[] b,int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
    public static void mergeSort(int[] arr){
        if(arr.length==1) return;
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<a.length;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<b.length;i++){
            b[i] = arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {70,60,50,40,30,20,10};
        print(arr);
        mergeSort(arr);
        System.out.println();
        print(arr);
    }
}
