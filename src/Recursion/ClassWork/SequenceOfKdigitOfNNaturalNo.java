package Recursion.ClassWork;
import java.util.*;
public class SequenceOfKdigitOfNNaturalNo {
    static List<List<Integer>> arr = new ArrayList<>();
    public static void sequence(int i, int n,int k, ArrayList<Integer> ans){
        if(ans.size()==k){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        if(i==n+1) return;
        sequence(i+1,n,k,ans);
        ans.add(i);
        sequence(i+1,n,k,ans);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 2;
        sequence(1,n,k,new ArrayList<>());
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
