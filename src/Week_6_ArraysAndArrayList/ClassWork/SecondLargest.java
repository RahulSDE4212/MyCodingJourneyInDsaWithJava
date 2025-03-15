package Week_6_ArraysAndArrayList.ClassWork;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,45,0,230,1};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != max){
                smax = Math.max(smax , arr[i]);
            }
        }
        System.out.println("Maximum element is : " + max);
        System.out.println(" the second largest element is : " + smax);
    }
}
