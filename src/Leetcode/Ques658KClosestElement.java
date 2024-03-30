package Leetcode;
import java.util.*;
public class Ques658KClosestElement {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l = new ArrayList<>();
        int n = arr.length;
        int lo = 0, hi = n-1;
        int ub = n;
        while(lo<=hi){
            int mid = lo +(hi - lo)/2;
            if(arr[mid]==x) {
                ub = mid;
                break;
            }
            else if(arr[mid]>x){
                ub = Math.min(mid,ub);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        int left = ub;
        int right = ub+1;


        while(k>0 && left>=0 && right<n){
            int leftDiff = Math.abs(arr[left]-x);
            int rightDiff = Math.abs(arr[right]-x);
            if(leftDiff>rightDiff){
                l.add(arr[right]);
                right++;
            }
            else if(leftDiff<rightDiff){
                l.add(arr[left]);
                left--;
            }
            else {
                l.add(arr[left]);
                left--;
            }
            k--;
        }
        if(right>n-1){
            while(k>0){
                l.add(arr[left]);
                k--;
            }
        }
        else {
            while(k>0){
                l.add(arr[right]);
                k--;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        List<Integer> l = findClosestElements(arr,4,3);
        System.out.println(l);


    }
}
