package ArraysAndArrayList.ClassWork;
import java.util.*;
public class SearchAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int x = sc.nextInt();
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("element found: ");
        else System.out.println("Element not found: ");
    }
}
