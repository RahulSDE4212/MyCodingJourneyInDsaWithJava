package Maths;

public class L68_EliminationGame {
    public static int lastRemaining(int n) {
        int remaining = n;
        boolean left = true;
        int step = 1;
        int head = 1;
        while(remaining>1){
            if(left || remaining%2==1){
                head += step;
            }
            remaining = remaining / 2;
            step *= 2;
            left = !left;
        }
        return head;
    }
    public static void main(String[] args) {
        int ans = lastRemaining(14);
        System.out.println(ans);
    }
}
