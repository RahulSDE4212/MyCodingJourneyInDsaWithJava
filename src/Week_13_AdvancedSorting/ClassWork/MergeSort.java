package Week_13_AdvancedSorting.ClassWork;

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
        // if the length of the array that needs to be sorted is 1
        // it means that the array is already sorted so we just need to return.
        if(arr.length==1) return;
        int n = arr.length; // the length of the array "arr".
        int[] a = new int[n/2]; // creating a dummy array 'a' which will store the first half of the array 'arr'.
        int[] b = new int[n-n/2]; // creating a dummy array 'b' which will store the second half of the array 'arr'.
        for(int i=0;i<a.length;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<b.length;i++){
            b[i] = arr[i+n/2];
        }
        mergeSort(a); // sorting the dummy array 'a'
        mergeSort(b); // sorting the dummy array 'b'.
        merge(a,b,arr); // merging the sorted array 'a' and 'b' in the array 'arr'.
    }
    public static void main(String[] args) {
        int[] arr = {70,60,50,40,30,20,10}; // original array that needs to be sorted.
        print(arr); // printing the array before sorting
        mergeSort(arr); // function call to sort the array
        System.out.println();
        print(arr); // printing the array after sorting.
    }
}
