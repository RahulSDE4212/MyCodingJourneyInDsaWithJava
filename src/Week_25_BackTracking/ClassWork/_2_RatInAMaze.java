package Week_25_BackTracking.ClassWork;

public class _2_RatInAMaze {
     static int finalAnswer;
    public static void f(int[][] maze, int i , int j){
        if(i == maze.length - 1&& j == maze.length - 1) {
            finalAnswer++;
        }
        // jis cell pe hu usko visited mark kar de
        maze[i][j] = 2;

        // kya left ja sakta hu kya
        if(canWeGo(maze, i, j - 1)) f(maze, i, j - 1);

        // upar ja sakta hu kya
        if(canWeGo(maze, i - 1, j)) f(maze, i - 1, j);

        // right ja sakta hu kya
        if(canWeGo(maze, i, j + 1)) f(maze, i, j + 1);

        // down ja sakta hu kya
        if(canWeGo(maze, i + 1, j)) f(maze, i + 1, j);

        maze[i][j] = 0;

    }

    private static boolean canWeGo(int[][] maze, int i, int j) {
        return (i >= 0 && i < maze.length && j >= 0 && j < maze.length && maze[i][j] == 0);
    }

    public static void main(String[] args) {
        int n = 7;

        finalAnswer = 0;

        // 0 -> means empty room
        // 1 -> means block room
        int[][] maze = {
                {0, 0, 1, 0, 0, 1, 0},
                {1, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0},
                {1, 0, 1, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0, 0, 0}
        };

        f(maze, 0, 0);
        System.out.println(finalAnswer);
    }
}
