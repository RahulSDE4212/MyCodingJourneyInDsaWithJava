package ArraysAndArrayList.Assignment;
import java.util.*;
public class LargestThreeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,1,1,1,1,1};
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                tmax = smax;
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i]<max){
                tmax = smax;
                smax = arr[i];
            }
            else if(arr[i]>tmax && arr[i]<smax){
                tmax = arr[i];
            }
        }
        System.out.println("The largest element is: "+ max);
        System.out.println("The second largest element is: "+ smax);
        System.out.println("The third largest element is: "+ tmax);
    }
}
