package Week_12_Recursion.Assignment;
import java.util.ArrayList;
import java.util.List;
public class GenerateArrays {
    // creating a method which will generate all the required arrays whose element is in
    // increasing order such that first element is from array A and second element is from array B
    // and this alternating fashion is continued till the last element of array B
    public static void generateAllArrays(int[] A, int[] B, List<Integer> ans, int i, int j,boolean bool){
        // base case
        if(!ans.isEmpty() && ans.size()%2==0){
            System.out.println(new ArrayList<>(ans));
        }
        if(bool){
            for(int k=i;k<A.length;k++){
                if(ans.isEmpty() || A[k]>ans.get(ans.size()-1)) {
                    ans.add(A[k]);
                    generateAllArrays(A,B,ans,k+1,j,!bool);
                    if(!ans.isEmpty()) ans.remove(ans.size()-1);
                }
            }
        }
        else{
            for(int k=j;k<B.length;k++){
                if(B[k]>ans.get(ans.size()-1)) {
                    ans.add(B[k]);
                    generateAllArrays(A,B,ans,i,k+1,!bool);
                    ans.remove(ans.size()-1);
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] A = {10, 15, 25};
        int[] B = {1, 17, 20, 30};
        // calling generate all arrays function
        generateAllArrays(A,B,new ArrayList<>(),0,0,true);
    }
}
