package Week_24_DynamicProgramming.ClassWork;
import java.util.*;



public class _3_lexicographicalNumber {
    static ArrayList<Integer> answer;
    public static void solve(int i, int n){
        if(i > n) return;
        if(i <= n && i != 0) answer.add(i);

        for(int j = (i == 0) ? 1 : 0; j <= 9; j++){
            solve(10 * i + j, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 13;
        answer = new ArrayList<>();
        solve(0, n);
        System.out.println(answer);

    }
}
