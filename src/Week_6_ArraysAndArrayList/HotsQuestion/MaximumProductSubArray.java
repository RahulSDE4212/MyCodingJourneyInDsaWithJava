package Week_6_ArraysAndArrayList.HotsQuestion;

public class MaximumProductSubArray {
    public static int maxProduct(int[] nums) {
        long maxProduct = (long)Integer.MIN_VALUE;
        int n = nums.length;

        /* **** Brute-Force approach ********* */
//        for(int i=0;i<n;i++){
//            long product = 1;
//            for(int j=i;j<n;j++){
//                product *= (long)nums[j];
//                if(product>Integer.MAX_VALUE) break;
//                if(product<Integer.MIN_VALUE) break;
//                maxProduct = Math.max(product,maxProduct);
//            }
//        }

        /* **********Optimized Approach ************** */
        long prefix = 1;
        long suffix = 1;
        for(int i=0;i<n;i++){
            prefix *= (long)nums[i];
            suffix *= (long)nums[n-1-i];
            maxProduct = Math.max(maxProduct,Math.max(prefix,suffix));
            if(prefix == 0)  prefix = 1;
            if(suffix == 0) suffix = 1;
            if(prefix<Integer.MIN_VALUE || prefix>Integer.MAX_VALUE) break;
            if(suffix<Integer.MIN_VALUE || suffix>Integer.MAX_VALUE) break;
        }
        return (int)maxProduct;
    }
    public static void main(String[] args) {
        int[] nums = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        int ans = maxProduct(nums);
        System.out.println("The maximum product of the subarray is: " + ans);

    }
}
