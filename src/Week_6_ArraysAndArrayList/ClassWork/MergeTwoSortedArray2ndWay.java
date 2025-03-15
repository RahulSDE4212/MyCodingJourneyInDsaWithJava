package Week_6_ArraysAndArrayList.ClassWork;
import java.util.*;
public class MergeTwoSortedArray2ndWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array a: ");
        int size1 = sc.nextInt();
        int[] a = new int[size1];
        System.out.print("enter the elements of the array a: ");
        for(int i = 0;i< a.length;i++){
            a[i] = sc.nextInt();
        }


        System.out.print("Enter the size of the array b: ");
        int size2 = sc.nextInt();
        int[] b = new int[size2];
        System.out.println("Enter the elements of the array b: ");
        for(int i = 0;i<b.length;i++){
            b[i] = sc.nextInt();
        }

        int[] c = new int[a.length + b.length];
        int i = a.length-1, j = b.length-1, k = c.length-1;

        while(i>=0 && j>=0){
            if(a[i]>=b[j]){
                c[k] = a[i];
                i--;
            }
            else {
                c[k] = b[j];
                j--;
            }
            k--;
        }

        if(i==-1){
            // put all the elements of array b in c
            while(j>=0){
                c[k] = b[j];
                j--;
                k--;
            }
        }

        if(j==-1){
            // put all the elements of array a in c
            while(i>=0){
                c[k]=a[i];
                i--;
                k--;
            }
        }
        for(int ele: c){
            System.out.print(ele + " ");
        }
    }
}
