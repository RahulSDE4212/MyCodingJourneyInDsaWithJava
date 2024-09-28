package Recursion.HotsQuestion;

public class TowerOfHanoi {
    public static void hanoi(int n, char S, char H, char D){
        // this function is created to move n disk from Source rod S to source rod D
        /*
        * this function does three times.
            -> first it moves n-1 disk from source to helper
            -> then it moves the last disk from source to destination
            -> then it moves n-1 disk from helper to destination
        * */
        if(n==0) return;
        hanoi(n-1,S,D,H);
        System.out.println(S+"->"+D);
        hanoi(n-1,H,S,D);
    }
    public static void main(String[] args){
        int n = 3;
        hanoi(n,'A','B','C');
    }
}
