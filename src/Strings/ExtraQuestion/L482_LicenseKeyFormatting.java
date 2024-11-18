package Strings.ExtraQuestion;

import java.util.ArrayList;

public class L482_LicenseKeyFormatting {
    public static String licenseKeyFormatting(String s, int k) {
    /*
        *** Approach 1 : StringBuilder With Reverse Traversal ***********
        Algorithm: T.C. = O(n)  S.C. = O(n)
            Step 1 : create a StringBuilder sb
            Step 2 : traverse from the last of the original string and keep track of "counter" which will count the no. of alphanumeric character stored so far.
            Step 3 : convert every character into capital letter and insert it into "sb" and then increase the "counter" by 1 if it is less than k
                     if it is equal to k we should make the counter equal to 0  and then insert dash into sb
            Step 4 : reverse the sb and then return the sb.toString().
    */
//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        for(int i=s.length()-1;i>=0;i--){
//            char ch = Character.toUpperCase(s.charAt(i));
//            if(ch!='-'){
//                if(count == k){
//                    sb.append('-');
//                    count = 0;
//                }
//                sb.append(ch);
//                count++;
//            }
//        }
//        return sb.reverse().toString();

        /*
        ************* Approach 2 : StringBuilde with modulus *********************
        * Time Complexity: O(n)
        * Space complexity: O(n)
        Step 1 : remove all the hyphens from the string and convert into uppercase.
        Step 2 : now count the number of character that needs to be present in the first group
                which is s.length() % k
        Step 3 : now insert the group with hyphen
        */
//        StringBuilder sb = new StringBuilder();
//        s = s.replace("-","").toUpperCase(); // O(n)
//        int mod = s.length() % k;
//        int i = 0;
//        if(mod != 0)
//        {
//            for (i = 0; i < mod; i++) {
//                sb.append(s.charAt(i));
//            }
//            sb.append("-");
//        }
//        for(;i<s.length();i+=k){ // O(n)
//            sb.append(s.substring(i,i+k));
//            if(i+k != s.length()) sb.append("-");
//        }
//        return sb.toString();

        /*
        ************ Approach 3 : using join method in java ********************
        * Time Complexity: O(n)
        * Space complexity: O(n)
        Step 1 : remove all hyphens from the string and convert it into uppercase.
        Step 2 : now split the string s into k groups and store every group into an arraylist.
        Step 3 : add hyphen between every group using join method of String class.
        */
        s = s.replace("-","").toUpperCase();
        int firstGroupLength = s.length()%k==0 ? k : s.length()%k;
        ArrayList<String> dummyAns = new ArrayList<>();
        dummyAns.add(s.substring(0,firstGroupLength));
        for(int i=firstGroupLength;i<s.length();i+=k){
            dummyAns.add(s.substring(i,i+k));
            i+=k;
        }
        return String.join("-",dummyAns);
    }
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String ans = licenseKeyFormatting(s,k);
        System.out.println(ans);
    }
} 
