package ArraysAndArrayList.ClassWork;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,4,5,10,6,7,10};
        System.out.print("Enter the target: ");
        int x = sc.nextInt();
        boolean flag = false;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == x)
                {
                    System.out.print(i + " " + j + " is the indices: ");
                    System.out.println();
                    flag = true;
                }
                if(flag) break;
            }
        }
    }
}
