package Week_6_ArraysAndArrayList.Assignment;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {12,0,56,89,96};
        int n = arr.length;
        boolean flag = true;
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1])  flag = false;
        }
        if(flag) System.out.println("Sorted");
        else System.out.println("Not sorted: ");
    }
}
