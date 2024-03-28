package ArraysAndArrayList.Assignment;
import java.util.*;
public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int start=0,end=arr.length-1;
        boolean flag = true;
        while(start<=end){
            if(arr[start] != arr[end]) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if(flag) System.out.println("Palindrome array: ");
        else System.out.println("Not a palindrome array: ");

    }
}
