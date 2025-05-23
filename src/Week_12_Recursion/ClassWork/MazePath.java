package Week_12_Recursion.ClassWork;
import java.util.*;
public class MazePath {
    public static int maze(int row, int col, int m, int n){
        if(row==m || col==n) return 1;
        //if(row>m || col>n) return 0;
        //if(row==m && col==n) return 1;
        int rightWays = maze(row,col+1,m,n);
        int leftWays = maze(row+1,col,m,n);
        return rightWays + leftWays;
    }
    public static int maze2(int m, int n){
        if(m==1 || n==1) return 1;
        int rightWays = maze2(m,n-1);
        int leftWays = maze2(m-1,n);
        return rightWays + leftWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println(maze2(m,n));
    }
}
