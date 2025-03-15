package Week_16_Stack.ClassWork;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();

        int n = arr.length;

        int[] ans = new int[n];

        ans[n-1] = -1;

        st.push(arr[n-1]);

        for(int i = n - 2; i >= 0; i--){
            while(!st.isEmpty() && st.peek() < arr[i]) st.pop();

            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(arr[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,7,4,6,2,3};

        System.out.println(Arrays.toString(arr));

        int[] ans = nextGreater(arr);

        System.out.println(Arrays.toString(ans));
    }
}
