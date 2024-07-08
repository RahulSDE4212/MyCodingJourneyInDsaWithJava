package Leetcode.BinarySearch;
import java.util.*;
public class no {
    public static int isPossible(ArrayList<Integer> arr, int mid){
        int noOfStudents = 0;
        int noOfPages = 0;
        int i = 0;
        while(i<arr.size()){ // i = 0 -> 1
            if((noOfPages + arr.get(i))<=mid){ // 0+12+24
                if(i==arr.size()-1){
                    noOfStudents++;
                    break;
                }
                else{
                    noOfPages += arr.get(i); // 12
                    i++;
                }
            }
            else{
                noOfStudents++;
                noOfPages = 0;
            }
        }
        return noOfStudents;
    }
    public static int maximum(ArrayList<Integer> arr){
        int max = 0;
        for(int i=0;i<arr.size();i++){
            max = Math.max(max, arr.get(i));
        }
        return max;
    }
    public static int sumOfArray(ArrayList<Integer> arr){
        int sum = 0;
        for(int i  =0;i<arr.size();i++){
            sum += arr.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(67);
        arr.add(90);
        int m = 2;
        int low = maximum(arr); // 90
        //System.out.println(low);
        int high = sumOfArray(arr); // 203 -> 145 -> 116
        //System.out.println(high);
        int ans = high;
        while(low<=high) {
            int mid = low + (high - low) / 2; // 146 -> 117 -> 103
            System.out.println(mid);
            int noOfStudetns = isPossible(arr, mid);
            System.out.println(noOfStudetns);
            if (noOfStudetns <= m) {
                high = mid - 1;
                ans = mid; // 146
            } else low = mid + 1;
        }
        System.out.println(ans);
    }
}
