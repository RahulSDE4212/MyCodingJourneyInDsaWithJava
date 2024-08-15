package AdvancedSorting.ClassWork;

public class Merge2SortedArray {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
    public static void merge(int[] a,int[] b,int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = {15,25,45,67,89};
        print(a);
        System.out.println();
        print(b);
        int[] c = new int[a.length + b.length];
        merge(a,b,c);
        System.out.println();
        print(c);
    }
}
