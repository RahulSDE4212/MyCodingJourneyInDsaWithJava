package Stack.ClassWork;

import java.util.Stack;

public class RemoveConsecutiveDuplicatesInAString {
    public static String removeDuplicates(String str){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(st.isEmpty()) st.push(str.charAt(i));
            else{
                if(st.peek() != str.charAt(i)) st.push(str.charAt(i));
            }
        }

        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "aaaabbbccccdefgg";
        String ans = removeDuplicates(str);
        System.out.println(ans);
    }
}
