package ArraysAndArrayList.HotsQuestion;

public class LongestSubArrayWithSumK {
    public static int sumOfSubArray(int[] A, int i , int j){
        int sum = 0;
        for(int k=i;k<=j;k++){
            sum += A[k];
        }
        return sum;
    }
    public static int lenOfLongSubArray(int[] A, int N, int K){

        /* ***************Brute-Force Approach ******************* */
//        int i = 0;
//        int maxLength = Integer.MIN_VALUE;
//        while(i<N){
//            int j = N-1;
//            int length = 0;
//            while(i<=j){
//                int sum = sumOfSubArray(A,i,j);
//                if(sum==K){
//                    length = j - i +1;
//                }
//                maxLength = Math.max(length,maxLength);
//                j--;
//            }
//            i++;
//        }
//        return maxLength;
//
        /* **********Optimized brute force approach ************************/
        int length = 0;
        for(int i=0;i<N;i++){
            int sum = 0;
            for(int j=i;j<N;j++){
                sum += A[j];
                if(sum==K) length = Math.max(length,j-i+1);
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] A = {7,-11,-3,-7,4,15,-13,18,10,-11};
        int ans = lenOfLongSubArray(A,A.length,10);
        System.out.println(ans);
    }
}
