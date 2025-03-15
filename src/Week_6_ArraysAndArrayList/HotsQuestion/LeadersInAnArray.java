package Week_6_ArraysAndArrayList.HotsQuestion;

public class LeadersInAnArray {
    public static boolean greaterThanAllRight(int[] arr, int i){
        /* ****************Brute-Force approach ******************** */
        int j = arr.length-1;
        while(j>=i){
            if(arr[j]>arr[i]) return false; // larger no. is present on the right side of i
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {4,7,1,0};
        int n = arr.length;
        int i = n-1;
//        while(i>=0){
//            // checking whether the number right to the arr[i] is smaller than arr[i] or not.
//            boolean bool = greaterThanAllRight(arr,i);
//            if(bool) System.out.print(arr[i] + " ");
//            i--;
//        }

        /* *********Optimal Approach ********************** */
        int largest = Integer.MIN_VALUE;
        while(i>=0){
            if(arr[i]>largest){
                largest = arr[i];
                System.out.print(arr[i] + " ");
            }
            i--;
        }
    }
}
