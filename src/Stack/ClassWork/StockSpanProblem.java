package Stack.ClassWork;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static int[] span(int[] stock){
        Stack<Integer> st = new Stack<>();
        int n = stock.length;
        int[] pge = new int[n];

        pge[0] = -1;

        st.push(0);

        for(int i = 1; i < n; i++){
            while(!st.isEmpty() && stock[st.peek()] < stock[i]) st.pop();

            pge[i] = (st.isEmpty()) ? -1 : st.peek();

            st.push(i);
        }

        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            ans[i] = i - pge[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] stock = {100, 80, 60, 70, 60, 75, 85};

        System.out.println(Arrays.toString(stock));

        int[] ans = span(stock);

        System.out.println(Arrays.toString(ans));
    }

}
