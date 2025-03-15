package Week_6_ArraysAndArrayList.Assignment;
import java.util.*;
public class StrictlyGreaterThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={12,7,8,17,19,22};
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        int count = 0;
        int start=0, end=arr.length-1;
        while(start<=end){
            if(arr[start]>x && arr[end]>x){
                count += 2;
            }
            else if(arr[start]>x){
                count+=1;
            }
            else if(arr[end]>x){
                count++;
            }
            start++;
            end--;
        }
        System.out.println(count);
    }
}
