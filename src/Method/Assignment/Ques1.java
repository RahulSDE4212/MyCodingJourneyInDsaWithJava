package Method.Assignment;

public class Ques1 {
    public static void printSquare(int n){
        for(int i=1;i<=n;i++){
            System.out.print((i*i) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printSquare(n);
    }
}
