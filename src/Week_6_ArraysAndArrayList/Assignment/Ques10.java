package Week_6_ArraysAndArrayList.Assignment;

public class Ques10 {
    public static void main(String[] args) {
        int[] arr={72,12,14,18,20,7,49};
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(i%2==0) arr[i]+=10;
            else arr[i] *= 2;
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}
