package TwoDimensionalArray.ClassWork;

public class WaveForm4 {
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{5,6,7},{9,10,11},{13,14,15}};
        print(arr);

        for(int j=0;j<arr[0].length;j++){ // columns
            if(j%2!=0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
}
