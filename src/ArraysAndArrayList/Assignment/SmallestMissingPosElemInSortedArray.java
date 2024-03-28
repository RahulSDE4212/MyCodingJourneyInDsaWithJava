package ArraysAndArrayList.Assignment;
import java.util.*;
public class SmallestMissingPosElemInSortedArray {
    public static int smallestMissingPos(int[] brr){
        int n = brr.length;
        int smallestMissing = 1;
        for(int i =0;i<n;i++){
            if(brr[i]<=smallestMissing) {
                smallestMissing = brr[i] + 1;
            }
        }
        return smallestMissing;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //finding smallest missing positive element in the array
        int result = smallestMissingPos(arr);
        System.out.println(result);

    }
}
