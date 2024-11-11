package ArraysAndArrayList.HotsQuestion;
/* ********** Algorithm used ***************************
   step 1 : we need to create a frequency array(freq)
          : freq array stores the frequency of every element of the array(arr)
   Step 2 : by using sliding window we will check whether the current subarray (left,right)
            deletion will make the array unique or not.
               -> if it makes then we start shrinking the subarray and keep checking
                   whether by shrinking the subarray keeps the array unique or not.
                       -> if it keeps, we will keep on shrinking
                       -> if not we will move right pointer
*/
public class ShortestSubArrayToBeRemoveToMakeArrayUnique {
    public static int shortestSubArray(int[] arr){
        int[] freq = new int[10000001];
        int minLength = Integer.MAX_VALUE;
        int notUniqueElement = 0;
        int left = 0;
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
            if(freq[arr[i]]==2) notUniqueElement++;
        }
        if(notUniqueElement==0) return 0;
        for(int right=0;right<arr.length;right++){
            freq[arr[right]]--;
            if(freq[arr[right]]==1) notUniqueElement--;
            while(notUniqueElement==0){
                minLength = Math.min(minLength,right-left+1);
                freq[arr[left]]++;
                if(freq[arr[left]]==2) notUniqueElement++;
                left++;
            }
        }
        return minLength;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,1,5,9,6};
        System.out.println(shortestSubArray(arr));
    }
}
