package TwoDimensionalArray.ClassWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void print(List<List<Integer>> l){
        for(int i=0;i<l.size();i++){
            for(int j=0;j<l.get(i).size();j++){
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the no of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> E = new ArrayList<>();
            for(int j=0;j<=i;j++){
                E.add(1);
            }
            l.add(E);
        }
        for(int i=0;i<l.size();i++){// rows
            for(int j=0;j<l.get(i).size();j++){
                if(j==0 || j==l.get(i).size()-1){
                    l.get(i).set(j,1);
                }
                else {
                    int num = l.get(i-1).get(j) + l.get(i-1).get(j-1);
                    l.get(i).set(j,num);
                }
            }
        }
        print(l);

    }
}
