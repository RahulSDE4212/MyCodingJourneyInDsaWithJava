package BasicSorting;

public class CheckIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,10,12};
        boolean bool = true;
        int i = 0 , n = arr.length;
        while(i<n-1){
            if (arr[i] > arr[i + 1]) {
                bool = false;
                break;
            }
            i++;
        }
        if(bool) System.out.println("Array is sorted: ");
        else System.out.println("Array is not sorted: ");
    }
}
