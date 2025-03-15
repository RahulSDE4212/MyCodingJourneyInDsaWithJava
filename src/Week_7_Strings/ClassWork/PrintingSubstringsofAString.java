package Week_7_Strings.ClassWork;

public class PrintingSubstringsofAString {
    public static void main(String[] args) {
        String s = "abcdefg";
        // print all substring of string s.
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
            System.out.print(s.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
