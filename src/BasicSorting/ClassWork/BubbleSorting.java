package BasicSorting;
import java.util.*;
public class BubbleSorting {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /* This is program for bubble sorting algorithm*/
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
    /* *********************************bubble sort - 1  **************************  */
//        for(int i=1;i<=n-1;i++){ // n-1 passes
//            for (int j = 0; j < n-1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        // Bubble sort optimized:

       /*    bubble sort - 2   */
//        for(int i=1;i<=n-1;i++){ // n-1 passes
//            for (int j = 0; j < n-i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        /*   bubble sort - optimized  */
        for(int i=1;i<=n-1;i++){ // n-1 passes
            boolean bool = true;
            for (int j = 0; j < n-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    bool = false;
                }
            }
            // checking this pass has sorted the array completely or not
            if(bool) break;
        }
        print(arr);
    }
}
