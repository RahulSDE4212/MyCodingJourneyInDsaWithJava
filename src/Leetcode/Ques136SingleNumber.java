package Leetcode;

public class Ques136SingleNumber {
    public static int singleNumber(int[] arr) {
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]) count++;
            }
            if(count == 1) {
                result = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int res = singleNumber(arr);
        System.out.println(res);
    }
}
