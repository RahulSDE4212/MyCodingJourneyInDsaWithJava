package ArraysAndArrayList.HotsQuestion;

import java.util.Arrays;

public class L2217FindPalindromeWithFixedLength {
    public static long[] kthPalindrome(int[] queries, int intLength) {
        int n = queries.length;
        long[] ans = new long[n]; // will store the final answer.
        int leftPalindromeLength = (intLength+1) / 2;
        int i = 0;
        long l = (long)(Math.pow(10,leftPalindromeLength-1));
        long r = (long)(Math.pow(10,leftPalindromeLength)-1);

        for(int q : queries){
            // check whether qth palindrome is within the range or not
            long totalCount = (r-l+1);
            if(q<=totalCount){
                String left = Long.toString(l+q-1);
                String right = (new StringBuilder(left).reverse().toString());
                long res = Long.parseLong(left+right.substring(intLength%2));
                ans[i++] = res;
            }
            else {
                ans[i++] = -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,90};
        int length = 4;
        long[] ans = kthPalindrome(nums,length);
        for(long ele: ans){
            System.out.print(ele + " ");
        }
        System.out.println(Arrays.toString(ans));
    }
}
