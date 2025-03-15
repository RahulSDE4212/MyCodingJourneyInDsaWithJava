package Week_12_Recursion.Assignment;

public class SumTriangle {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void printASumTriangle(int[] arr){
        if(arr.length == 1){
            print(arr);
            return;
        }
        print(arr);
        int[] ans = new int[arr.length-1];
        int j = 0;
        for(int i = 1;i<arr.length;i++){
            ans[j++] = arr[i] + arr[i-1];
        }
        printASumTriangle(ans);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        printASumTriangle(arr);
    }
}
