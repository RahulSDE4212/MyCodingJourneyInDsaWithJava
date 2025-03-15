package Week_7_Strings.ExtraQuestion;

public class L7_ReverseInteger {
    public static int reverse2(int x) {
        long ans = 0;
        while(x != 0){
            int rem = x % 10;
            ans = ans * 10 + rem;
            x = x / 10;
        }
        if(ans<(long)Integer.MIN_VALUE || ans>(long)Integer.MAX_VALUE) return 0;
        return (int)ans;
    }
    // brute force kind of approach
    public static int reverse1(int x) {
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder();
        int i = str.length()-1;
        while(i>=0){
            if(str.charAt(i)=='-'){
                i--;
                continue;
            }
            sb.append(str.charAt(i));
            i--;
        }
        String aux = sb.toString();
        long num = Long.parseLong(aux);
        if(x<0) num *= -1;
        if(num>(long)Integer.MAX_VALUE || num<(long)Integer.MIN_VALUE) return 0;
        return (int)num;
    }
    public static void main(String[] args) {
        int x = -123;
        int reverse = reverse2(x);
        System.out.println(reverse);
    }
}
