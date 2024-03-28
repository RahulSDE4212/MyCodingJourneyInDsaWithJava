/* *********************** pass by Reference ******************
 * 1) Basically when we pass array to a method in java then they are passed by reference
 * 2) here in this program you can see that an array is passed to a method.
 * 3) here arr and brr both are the reference variable of the samer array.
 * */

package ArraysAndArrayList.ClassWork;
import java.util.*;
public class PassingAnArrayToMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the element of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int x:arr){ // for each loop
            System.out.print(x + " ");
        }
        System.out.println();
        change(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] brr){ // pass by reference
        brr[0] = 15;
        brr[1] = 16;
        brr[2] = 17;
        brr[3] = 18;
        brr[4] = 19;
    }

}
