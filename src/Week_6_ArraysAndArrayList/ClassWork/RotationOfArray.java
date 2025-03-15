package Week_6_ArraysAndArrayList.ClassWork;
import java.util.*;
public class RotationOfArray {

    public static void rotate(int[] nums, int k) {
        /* ********Method 2 *************** */
        // not using any extra space
        int[] arr = new int[nums.length];
        int n = nums.length;
        k = k % n;
        int i = 0;
        while(k>0){
            arr[i] = nums[n-k];
            k--;
            i++;
        }
        int j = 0;
        while(i<arr.length){
            arr[i] = nums[j];
            i++;
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K: "); // k = no of times rotation is being done
        int k = sc.nextByte();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        rotate(a,k);

        /* ****** Method 1 ************* */
        // by using extra space by creating an auxiliary array

//        System.out.println(Arrays.toString(a)); // printing original array
//        int n = a.length;
//        int[] arr = new int[n]; // creating a new array
//        k = k % n;
//
//        int i = 0;
//        while(k>0){
//            arr[i] = a[n-k];
//            k--;
//            i++;
//        }
//        int j = 0;
//        while(i<arr.length){
//            arr[i] = a[j];
//            j++;
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
