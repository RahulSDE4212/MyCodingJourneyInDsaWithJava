package Week_7_Strings.LeetCode;

public class L2000_ReversePrefixOfWord {
    public static  String reversePrefix(String word, char ch) {
        /* Approach-1 : Using StringBuilder and reverse method
        * Time complexity  : O(n)
        * Space complexity : O(n)
        * Algorithm:
        *   step 1 : traverse the string word to find the first occurrence of the character ch.
        *   step 2 : if ch is found revese the substring from start to the index of the ch and append the remaining part
        *            of the string. and return it.
        *   step 3 : if ch is not found return the original string.
        * */
//        StringBuilder sb = new StringBuilder(word);
//        int i = 0;
//        while(i<word.length()){
//            char chr = word.charAt(i);
//            if(chr != ch) i++;
//            else break;
//        }
//        if(i==word.length()) return word;
//        StringBuilder original = new StringBuilder(sb.substring(0,i+1));
//        String reverse = original.reverse().toString();
//        sb.replace(0,i+1,reverse);
//        return sb.toString();

        /* Approach 2 : using stack
        * Time complexity : O(n)
        * Space complexity : O(n)
        * Algorithm:
        *   step 1 : traverse the string word and in every iteration push the character at present
        *            index into stack. if the character is ch only, no need to travel further.
        *   step 2 : if character ch is not present at the top of the stack return the string word only
        *           without doing anything.
        *   step 3 : now create a string from the character present in the stack by popping one by one.
        *   step 4 : join the string created in step 3 to the substring of word from i+1 index to its end.
        *   step 5 : return the string obtained in step 4.
        * */
//        Stack<Character> st = new Stack<>(); // space complexity : O(n)
//        int i = 0;
//        while(i<word.length()){ // time complexity : O(n)
//            char chr = word.charAt(i);
//            if(chr == ch){
//                st.push(chr);
//                break;
//            }
//            st.push(chr);
//            i++;
//        }
//        if(st.size()==word.length() && st.peek()!=ch) return word;
//        String reverse = ""; // space complexity : O(n)
//        while(st.size() != 0){ // time complexity : O(n)
//            reverse += st.pop();
//        }
//        String ans = ""; // space complexity : O(n)
//        ans += reverse;
//        ans += word.substring(i+1);
//        return ans;
        /* Approach 3 : using two pointer technique
        * Time complexity  : O(n)
        * Space complexity : O(n)
        * Algorithm :
        *   step 1 : convert the string word into an character array.
        *   step 2 : keep two pointers on the array, one at start of the array and one at end
        *   step 3 : now keep the pointer i at the first occurrence of the character ch
        *   step 4 : using two pointer technique reverse the character array from o to index i in place.
        *   step 5 : convert the character array into an string and return it.
        *
        * */

//        char[] charArray = word.toCharArray();
//        int i = 0;
//        int j = charArray.length;
//        while(i<=j){
//            char chr = charArray[i];
//            if(chr==ch){
//                break;
//            }
//            i++;
//        }
//        if(i>j) return word;
//        int k = 0;
//        while(k<=i){
//            char aux = charArray[k];
//            charArray[k] = charArray[i];
//            charArray[i] = aux;
//            k++;
//            j--;
//        }
//        return charArray.toString();

        /* Approach 4 : using String manipulation
        * Time complexity  :
        * Space complexity :
        * Algorithm :
        *   Step 1 : Traverse the string to traverse to locate the index of the first occurrence of ch.
        *   Step 2 : if found, reverse the substring upto the index and concatenate it with remaining part of the string.
        * */
        int i = 0;
        while(i<word.length()){
            char chr = word.charAt(i);
            if(chr == ch) {
                break;
            }
            i++;
        }

        String reverse = "";
        for(int k=0;k<=i;k++){
            reverse += word.charAt(i);
        }
        return reverse + word.substring(i+1);


    }
    public static void main(String[] args) {
        String s = "abcdefd";
        char ch = 'd';
    }
}
