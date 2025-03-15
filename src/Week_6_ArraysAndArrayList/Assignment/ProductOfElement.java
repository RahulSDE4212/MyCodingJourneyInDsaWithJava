package Week_6_ArraysAndArrayList.Assignment;

import java.util.Scanner;

public class ProductOfElement {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] arr = {1,2,3,4,5,6,7};
                int product = 1;

                // Method 1
//                for (int i = 0; i < arr.length; i++) {
//                    product *= arr[i];
//                }

                // Method 2
                int start=0,end=arr.length-1;
                while(start<=end){
                    if(start != end) product = product * arr[start] * arr[end];
                    else product = product * arr[start];
                    start++;
                    end--;
                }
                System.out.println("The product is: "+ product);


    }
}
