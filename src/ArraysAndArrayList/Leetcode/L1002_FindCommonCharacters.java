package ArraysAndArrayList.Leetcode;
import java.util.*;
public class L1002_FindCommonCharacters {
    public static void helper(int[] freq,String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
    }
    public static List<String> commonChars(String[] words) {
        /* **************** Approach-1: using frequency array ***************
        Time complexity :  O(n*L) where l is the average length of the string present in array word.
        Space complexity : O(L) where L is the length of the longest string present in the array word.
        * Algorithm:
        *   step 1 : for each string present in the array words, count the no of occurrence of each alphabet present in
        *            the string.
        *   step 2 : store the minimum of occurrences of alphabet in string present at index i and i-1 in freq array.
        *   step 3 : traverse the entire array and do the same
        *   step 4 : store the alphabet unte baar jitne baar freq array me present hai in arraylist.
        *   step 5 : return the arraylist.
        * */
        List<String> finalAns = new ArrayList<>();
        int[] freq = new int[26];
        helper(freq,words[0]); // word array ke first string ke alphabet ka frequency count kiya gya hai.
        for(int i=1;i<words.length;i++){
            int[] auxiliary = new int[26];
            helper(auxiliary,words[i]); // harek string ke alphabet ka frequency count kiya gya hai.
            for(int j=0;j<freq.length;j++){
                freq[j] = Math.min(freq[j],auxiliary[j]); // do adjacent word ke alphabet ke occurrence ke minimum store kiya ja rha hia.
            }
        }
        // jitne baar freq array me alphabet ka occurrence hai utne baar us alphabet ko store karna hai.
        for(int i=0;i<freq.length;i++){
            int noOfTimes = freq[i];
            while(noOfTimes != 0){
                finalAns.add(String.valueOf((char)('a'+i)));
                noOfTimes--;
            }
        }
        return finalAns;

    }
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> ans = commonChars(words);
        System.out.println(ans);
    }
}
