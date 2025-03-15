package Week_12_Recursion.HotsQuestion;

public class L60_PermutationSequence {
    static String finalAns = "";
    static int req = 1;
    public static void solve(String st, int k,String ans){
        // base case
        if(st.isEmpty() && req == k){
            System.out.println(req);
            finalAns = ans;
            req++;
            System.out.println(ans);
            System.out.println(finalAns);
            return;
        }
        if(st.isEmpty()){
            System.out.println(req);
            req++;
            System.out.println(ans);
            return;
        }
        for(int i=0;i<st.length();i++){
            String left = st.substring(0,i);
            String right = st.substring(i+1);
            solve(left+right,k,ans+st.charAt(i));
        }
    }
    public static String getPermutation(int n, int k) {
        String st = "";
        for(int i =1;i<=n;i++){
            st += i;
        }
        System.out.println(st);
        req = 1;
        System.out.println(req);
        solve(st,k,"");
        return finalAns;
    }

    public static void main(String[] args) {
        String aux = getPermutation(3,3);
        System.out.println(aux);
    }
}
