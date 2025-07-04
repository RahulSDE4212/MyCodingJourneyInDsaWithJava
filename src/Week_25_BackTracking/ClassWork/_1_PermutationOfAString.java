package Week_25_BackTracking.ClassWork;

public class _1_PermutationOfAString {
    public static void permutation(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            permutation(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
        }
    }
    public static void change(String str){
        str += "rah";
    }
    public static void change2(StringBuilder sb){
        sb.delete(0, 1);
    }
    public static void swap(StringBuilder sb, int i, int j){
        char ch = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, ch);
    }
    public static void permutation2(StringBuilder sb, int i){
        if(i == sb.length() - 1){
            System.out.println(sb);
            return;
        }
        for(int ind = i; ind < sb.length(); ind++){
            if(ind != i && sb.charAt(ind) == sb.charAt(i)) continue;
            swap(sb, i, ind);
            permutation2(sb, i + 1);
            swap(sb, i, ind);
        }
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aba");
        permutation2(sb, 0);
    }
}
