package Week_25_BackTracking.ClassWork;

public class _3_KnightMove {
    public static boolean isSafe(int[][] chess, int r, int c, int n){
        return r >= 0 && r < n && c >= 0 && c < n && chess[r][c] == 0;
    }
    static int[] dx = {-2, -1, +1, +2, +2, +1, -1, -2};
    static int[] dy = {+1, +2, +2, +1, -1, -2, -2, -1};
    public static void f(int[][] chess, int r, int c, int count, int n){
        if(count == n * n){
            chess[r][c] = count;
            print(chess);
            chess[r][c] = 0;
            return;
        }

        // mark the cell visited
        chess[r][c] = count;

        for(int i = 0; i < 8; i++){
            if(isSafe(chess, r + dx[i], c + dy[i], n)){
                f(chess, r + dx[i], c + dy[i], count + 1, n);
            }
        }
        chess[r][c] = 0;
    }

    private static void print(int[][] chess) {
        int n = chess.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(chess[i][j]);
                System.out.print('\t');
            }
            System.out.println();
            System.out.println();
        }

        System.out.println("*********************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\*********************");
    }

    public static void main(String[] args) {
        int n = 8;

        int[][] chess = new int[n][n];

        f(chess, 0, 0, 1, n);
    }
}
