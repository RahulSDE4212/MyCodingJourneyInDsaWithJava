package Week_12_Recursion.ClassWork;

public class ArrayTraversal {
    public static void print(int i, int[] arr){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {4,3,1,6,3,5};
        // iterative approach
//        for(int ele: arr){
//            System.out.print(ele + " ");
//        }

        // recursive approach
        print(0,arr);
    }
}
