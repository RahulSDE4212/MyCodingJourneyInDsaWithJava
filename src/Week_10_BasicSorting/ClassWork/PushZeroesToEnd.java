package Week_10_BasicSorting.ClassWork;

public class PushZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,4,0,2,-40,100,0,5};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean bool = true;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]==0) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    bool = false;
                }
            }
            if(bool) break;
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}
