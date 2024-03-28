package ArraysAndArrayList.ClassWork;
import java.util.*;
public class BuiltinMethod {
    public static void main(String[] args) {
        int[] arr = {10,34,23,3,25};
        for(int x : arr){ // for each loop
            System.out.print(x + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
