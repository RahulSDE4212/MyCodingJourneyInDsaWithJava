package Week_6_ArraysAndArrayList.HotsQuestion;

public class L885_spiralMatrixIII {
    public static void  spiralMatrixIII(int rows, int cols, int rstart, int cstart) {
//        List<List<Integer>> ans = new ArrayList<>(); // final answer ko store karne ke liye
        int[][] ans = new int[rows*cols][2];
        int[][] direction = {{0,1}, // east
                {1,0}, // south
                {0,-1}, // west
                {-1,0}, // north
        };
        int steps = 0;
        int dir = 0;
        int r = 0;
        int c = 0;
        ans[r][c++]=rstart;
        ans[r++][c] = cstart;
        c = 0;

//        List<Integer> aux = new ArrayList<>();
//        aux.add(rstart);
//        aux.add(cstart);
//        ans.add(aux);
        while(r < rows*cols){
            if(dir == 0 || dir == 2) steps++;
            for(int count = 1; count <= steps; count++){
                rstart += direction[dir][0];
                cstart += direction[dir][1];
                if(rstart>=0 && rstart<rows && cstart>=0 && cstart<cols){
//                    List<Integer> aux2 = new ArrayList<>();
//                    aux2.add(rstart);
//                    aux2.add(cstart);
//                    ans.add(aux2);
                    ans[r][c++] = rstart;
                    ans[r++][c] = cstart;
                    c = 0;
                }
            }
            dir = (dir+1)%4;
        }
        int index = 0;

//        int[][] finalAns = new int[rows*cols][2];
//        for(int i=0;i<rows*cols;i++){
//            for(int j=0;j<2;j++){
//                finalAns[i][j] = ans.get(index).get(j);
//            }
//            index++;
//        }
        for(int[] ele:ans){
            for(int elem: ele){
                System.out.print(elem);
            }
            System.out.println();
        }
//        System.out.println(ans);
    }

    public static void main(String[] args) {
        int rows = 1, cols = 4, rstart = 0, cstart = 0;
        spiralMatrixIII(rows,cols,rstart,cstart);
    }
}
