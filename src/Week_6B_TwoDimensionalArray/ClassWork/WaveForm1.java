package Week_6B_TwoDimensionalArray.ClassWork;

public class WaveForm1 {
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
        int[][] arr = {{1,2,3},{5,6,7},{9,10,11},{13,14}};
        print(arr);

        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for (int j = arr[i].length-1; j>=0; j--) {
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}
