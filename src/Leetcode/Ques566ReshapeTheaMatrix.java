package Leetcode;
import java.util.ArrayList;
import java.util.List;

public class Ques566ReshapeTheaMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = mat.length, c = mat[0].length;
        int[][] arr = new int[r][c];
        List<Integer> l = new ArrayList<>();
        for(int[] ele : mat){
            for(int x : ele){
                l.add(x);
            }
        }
        int k = 0;
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = l.get(k);
                k++;
            }
        }
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x);
            }
            System.out.println();
        }



    }
}
