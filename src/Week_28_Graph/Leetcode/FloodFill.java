package Week_28_Graph.Leetcode;

// https://leetcode.com/problems/flood-fill/description/

class FloodFill {
    static int[] dx;
    static int[] dy;

    public boolean isSafe(int[][] image, int i, int j, int color, int originalColor){
        return i >= 0 && i < image.length &&
               j >= 0 && j < image[0].length &&
               image[i][j] == originalColor &&
               image[i][j] != color;
    }

    public void f(int[][] image, int sr, int sc, int color, int originalColor){
        image[sr][sc] = color;

        for(int i = 0; i < 4; i++){
            int newRow = sr + dx[i];
            int newCol = sc + dy[i];

            if(isSafe(image, newRow, newCol, color, originalColor))
                f(image, newRow, newCol, color, originalColor);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dx = new int[]{0, +1, 0, -1};
        dy = new int[]{+1, 0, -1, 0};

        int originalColor = image[sr][sc];
        if(originalColor != color)
            f(image, sr, sc, color, originalColor);

        return image;
    }
}
