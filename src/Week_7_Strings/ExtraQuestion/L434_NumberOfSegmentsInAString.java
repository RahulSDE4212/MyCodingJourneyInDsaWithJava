package Week_7_Strings.ExtraQuestion;

public class L434_NumberOfSegmentsInAString {
    public static int countSegments(String s) {
        int count = 0;
        int i = 0;
        while(i<s.length()){
            while(i<s.length() && s.charAt(i)==' ') i++;
            if(i<s.length()) count++;
            while(i<s.length() && s.charAt(i)!=' ') i++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "    Hello     my      name     is     rahul      ";
        int ans = countSegments(s);
        System.out.println(ans);
    }
}
