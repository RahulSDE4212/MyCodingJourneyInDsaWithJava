package Week_6_ArraysAndArrayList.Assignment;

import java.util.Scanner;

public class DuplicateElement {
    public static void duplicateElement(int[] brr){
        int element;
        boolean flag = false;
        for(int i=0;i<brr.length;i++){
            for (int j = i+1; j < brr.length; j++) {
                if(i>=1 && brr[i]==brr[i-1]) break;
                if(brr[i]==brr[j]) {
                    flag = true;
                    System.out.println(brr[j]+" has duplicate element at index "+j);
                    break;
                }
            }
        }
        if(!flag) System.out.println("no duplicate element: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        duplicateElement(arr);
    }
}
