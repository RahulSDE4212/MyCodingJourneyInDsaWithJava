package Week_6B_TwoDimensionalArray.ClassWork;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        for(int[] ele: arr){
            for(int x: ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // spiral printing:
        int minR=0,maxR=arr.length-1,minC=0,maxC=arr[0].length-1;
        while(minR<=maxR && minC <= maxC){
            // left to right
            for(int j=minC;j<=maxC;j++){
                System.out.print(arr[minR][j]+ " ");
            }
            minR++;
            if(minR>maxR || minC > maxC) break;
            // top to bottom
            for(int i=minR;i<=maxR;i++){
                System.out.print(arr[i][maxC] + " ");
            }
            maxC--;
            if(minR>maxR || minC > maxC) break;
            // right to left
            for(int j=maxC;j>=minC;j--){
                System.out.print(arr[maxR][j]+" ");
            }
            maxR--;
            if(minR>maxR || minC > maxC) break;
            // bottom to top
            for(int i=maxR;i>=minR;i--){
                System.out.print(arr[i][minC]+" ");
            }
            minC++;
        }
    }
}
