package ArraysAndArrayList.ClassWork;
import java.util.*;
public class DutchFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,0,0};


//        /* ********************Method 1 ******************** */

//        int n = arr.length;
//        int noOfZeroes = 0;
//        int noOfOnes = 0;
//        for (int j : arr) {
//            if (j == 0) noOfZeroes++;
//            if (j == 1) noOfOnes++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<noOfZeroes) arr[i]=0;
//            else if(i<noOfZeroes+noOfOnes) arr[i]=1;
//            else arr[i]=2;
//        }
//        for(int ele: arr){
//            System.out.print(ele + " ");
//        }


//        /* ***** Method 2 Dutch Flag Algorithm ****** */
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        

    }
}
