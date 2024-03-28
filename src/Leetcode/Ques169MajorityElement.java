package Leetcode;

public class Ques169MajorityElement {
    public static int majorityElement(int[] arr){
        // Method 1 Brute force approach

//        int mid = arr.length/2;
//        int res = arr[0];
//        for(int i=0;i<arr.length;i++){
//            int count = 0;
//            for(int j=0;j<arr.length;j++){
//                if(arr[j]==arr[i]) count++;
//            }
//            if(count>=mid) res = arr[i];
//        }
//        return res;

        // Method 2 Moore's Voting Algorithm
        int majority = arr[0];
        int votes = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==majority){
                votes++;
            }
            else votes--;
            if(votes == 0) {
                majority = arr[i];
                votes = 1;
            }
        }
        return majority;

    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int res = majorityElement(arr);
        System.out.println(res);
    }
}
