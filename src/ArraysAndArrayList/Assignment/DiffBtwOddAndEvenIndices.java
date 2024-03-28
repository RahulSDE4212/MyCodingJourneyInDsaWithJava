package ArraysAndArrayList.Assignment;
import java.util.*;
public class DiffBtwOddAndEvenIndices {
    public static void main(String[] args) {
        int[] arr= {76,12,89,98,17,21};
        // sumOdd = 182
        // sumEven = 131
        int sumOdd = 0, sumEven = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2 != 0) sumOdd+=arr[i];
            else sumEven += arr[i];
        }
        System.out.println("Sum of odd indices num: " + sumOdd);
        System.out.println("Sum of even indices num: " + sumEven);

        int diff = Math.abs(sumEven-sumOdd) ;
        System.out.println(diff);

    }
}
