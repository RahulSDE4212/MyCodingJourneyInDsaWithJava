package Strings.ExtraQuestion;

public class L482_LicenseKeyFormatting {
    /*
    ************** Approach 1 - Using StringBuilder **********
            step 1 : first remove all the dashes from the string.
            step 2 : convert the string  to uppercase
            step 3 : reverse the string
            step 4 : add dash (-) at every kth position
            step 5 : reverse the modified string. this is the answer
    */
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder(s.replace("-","").toUpperCase());
        sb.reverse();
        StringBuilder ans = new StringBuilder();
        int count = 0;
        int i = 0;
        while(i<sb.length()){
            if(count<k){
                ans.append(sb.charAt(i));
                count++;
                i++;
            }
            else{
                count = 0;
                ans.append('-');
            }
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String ans = licenseKeyFormatting(s,k);
        System.out.println(ans);
    }
}
