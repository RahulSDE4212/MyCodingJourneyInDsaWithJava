package ArraysAndArrayList.ClassWork;
import java.util.*;
public class MaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,45,63,230,1};

        /* ********* METHOD 1 ******************* */
//        int max = arr[0];
//        for(int i = 1;i<arr.length;i++){
//            if(arr[i] > max ) max = arr[i];
//        }
//        System.out.print("Maximum element is : " + max);

        /* **************** METhOD 2 *************** */
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
//            if(arr[i]>max) max = arr[i];
            max = Math.max(arr[i],max);
        }
        System.out.println("Maximum element is : " + max);
    }
}
