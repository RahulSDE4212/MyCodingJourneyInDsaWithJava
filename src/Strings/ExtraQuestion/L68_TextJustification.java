package Strings.ExtraQuestion;
import java.util.*;
public class L68_TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        int i = 0;
        List<String> finalAns = new ArrayList<>();
        while(i<words.length){
            int j = i +1;
            int wc = words[i].length();
            int can = 0; // kitne candidate hai space ke liye
            while(j<words.length && wc+can+words[j].length()+1<=maxWidth){
                wc += words[j].length();
                can++;
                j++;
            }
            int rem = maxWidth-wc;
            int atLeast = can==0 ? 0 : rem / can;
            int extra =can ==0 ? 0 : rem % can;
            StringBuilder sb = new StringBuilder();
            if(j==words.length){
                atLeast = 1;
                extra = 0;
            }
            for(int k=i;k<j;k++){
                sb.append(words[k]);
                if(k==j-1) break;
                for(int l=1;l<=atLeast;l++) sb.append(" ");
                if(extra>0){
                    sb.append(" ");
                    extra--;
                }
            }
            while(sb.length()<maxWidth){
                sb.append(" ");
            }
            finalAns.add(sb.toString());
            i = j;
        }
        return finalAns;
    }

    public static void main(String[] args) {
        String[] words = {"this","is","an","example","of","text","justification"};
        int wordLength = 16;
        List<String> ans = fullJustify(words,wordLength);
        System.out.println(ans);
    }
}
