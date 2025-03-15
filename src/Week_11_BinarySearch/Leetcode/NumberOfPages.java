package Week_11_BinarySearch.Leetcode;

public class NumberOfPages {
    public static int isPossible(int[] blocks, int mid){
        int noOfStudents = 0;
        int noOfPages = 0;
        int i = 0;
        while(i<blocks.length){
            if(blocks[i]+noOfPages<=mid){
                if(i==blocks.length-1){
                    noOfStudents++;
                    break;
                }
                else{
                    noOfPages += blocks[i];
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
    public static int sumOfArray(int[] blocks){
        int sum = 0;
        for(int i=0;i<blocks.length;i++){
            sum += blocks[i];
        }
        return sum;
    }
    public static int maximum(int[] blocks){
        int max1 = Integer.MIN_VALUE;
        for(int i=0;i<blocks.length;i++){
            max1 = Math.max(max1,blocks[i]);
        }
        return max1;
    }
    public static void main(String[] args) {
        int[] blocks = {12, 34, 67, 90};
        int students = 2;
        int low = maximum(blocks);
        int high = sumOfArray(blocks);
        int ans = high;
        while(low<=high){
            int mid = low + (high - low)/2;
            //System.out.println(mid);
            int noOfStudents = isPossible(blocks,mid);
            //System.out.println(noOfStudents);
            if(noOfStudents<=students){
                high = mid - 1;
                ans = mid;
            }
            else low = mid + 1;
        }
        System.out.println(ans);
    }
}
