package Week_6_ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class Drone {
    public static int maximumPackage(int[] arr, int capacity){
        int sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(sum<capacity){
                sum += arr[i];
                count++;
            }
            if(sum<=capacity) return count;
            if(sum>capacity) return 0;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int capacity = sc.nextInt();
        Arrays.sort(arr);
        int total = maximumPackage(arr,capacity);
        System.out.println(total);

    }
}
