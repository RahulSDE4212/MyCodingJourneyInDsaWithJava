package Leetcode;

public class Ques268MissingNumber {
    public static int missingNumber(int[] arr){
        /* ******* Brute Force Approach ************ */
//        int output =  -1;
//        for(int i=0;i<=arr.length;i++){
//            boolean flag = false;
//            for(int j=0;j<arr.length;j++){
//                if(arr[j]==i) flag = true;
//            }
//            if(!(flag)) output = i;
//        }
        /* ********* method 2 : mathematical approach ************* */
//        int n = arr.length;
//        int expectedSum =( n*(n+1)) / 2;
//        int sum = 0;
//        for(int i=0;i<arr.length;i++){
//            sum = sum + arr[i];
//        }
//        return (expectedSum-sum);
        /* ************* Method 3: Xor operator *******************/
        int expectedZor = 0;
        for(int i=0;i<=arr.length;i++){
            expectedZor = expectedZor ^ i;
        }
        int zor = 0;
        for(int i=0;i<arr.length;i++){
            zor = zor ^ arr[i];
        }
        return expectedZor ^ zor;
    }
    public static void main(String[] args) {
        int[] arr = {0,1};
        int no = missingNumber(arr);
        System.out.println(no);

    }
}
