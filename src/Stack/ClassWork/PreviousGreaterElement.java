package Stack.ClassWork;
import java.util.*;
public class PreviousGreaterElement {
    public static int[] previousGreaterElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            int curr = arr[i];
            if(st.isEmpty()) arr[i] = -1;
            else arr[i] = st.peek();
            st.push(curr);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10,4,2,20,40,12,30};
        int[] ans = previousGreaterElement(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
