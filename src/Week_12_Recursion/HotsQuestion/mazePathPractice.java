package Week_12_Recursion.HotsQuestion;

public class mazePathPractice {
    public static int mazePath(int cr,int cc,int sr,int sc){
        // the base case will be if cr>sr ya phir cc>sc
        if(cr>sr || cc>sc) return 0;
        if(cr==sr && cc==sc) return 1;
        // total ways to reach from (1,1) -> (3,3)
        int rigtways = mazePath(cr,cc+1,sr,sc);
        int downways = mazePath(cr+1,cc,sr,sc);
        return rigtways+downways;
    }
    public static void mPath(int cr, int cc, int sr,int sc,String ans){
        if(cr>sr || cc>sc) return;
        if(cr==sr && cc==sc){
            System.out.println(ans);
            return;
        }
        mPath(cr+1,cc,sr,sc,ans+'D');
        mPath(cr,cc+1,sr,sc,ans+'R');
    }
    public static void main(String[] args) {
        int tr = 3;
        int tc = 3;
        int ans = mazePath(1,1,3,3);
        mPath(1,1,3,3,"");
        System.out.println(ans);
    }
}
