package BinarySearch;

import java.util.ArrayList;

public class MatrixMedianBruteForce {
    public static void sort(ArrayList<Integer> ans){
        int i = 0;
        while(i<ans.size()-1){
            int j = 0;
            while(j<ans.size()-1-i){
                if(ans.get(j)>ans.get(j+1)){
                    int temp = ans.get(j);
                    ans.set(j,ans.get(j+1));
                    ans.set(j+1,temp);
                }
                j++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("This is the program for matrix median: ");
        int[][] mat = {{1,4,9},{2,5,6},{3,8,7}};
        // 1 2 3 4 5 6 7 8 9 -> median 5
        ArrayList<Integer> ans = new ArrayList<>();
        int m = mat.length, n = mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans.add(mat[i][j]);
            }
        }
        sort(ans);
        System.out.println("median is " + ans.get((m*n)/2));

    }
}
