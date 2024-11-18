package BasicSorting;
public class SelectionSortPart_2 {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        print(arr);
        System.out.println();
        for (int i = 0; i < n - 1; i++) { // n-1 passes
            int max_idx = 0;
            for (int j = 0; j <= n - 1 - i; j++) {
                if (arr[j] > arr[max_idx]) max_idx = j;
            }
            swap(arr, max_idx, n - 1 - i);
        }
        print(arr);
    }
}