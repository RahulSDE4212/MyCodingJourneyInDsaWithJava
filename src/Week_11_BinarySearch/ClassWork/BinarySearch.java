package Week_11_BinarySearch.ClassWork;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,15,21,34,81,105,180,500};
        int n = arr.length;
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int low = 0, high = n-1;
        boolean flag = false;
        int target_idx = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]==target){
                flag = true;
                target_idx = mid;
                break;
            }
            else if(arr[mid] > target) high = mid - 1;
            else if(arr[mid] < target) low = mid +1;
        }
        System.out.println(target_idx);
        if(flag) System.out.println("the element is found at " + target_idx);
        else System.out.println("The element is not found");
    }
}
