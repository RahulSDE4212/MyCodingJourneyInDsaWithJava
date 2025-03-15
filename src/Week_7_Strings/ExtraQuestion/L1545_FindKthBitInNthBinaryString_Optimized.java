package Week_7_Strings.ExtraQuestion;

public class L1545_FindKthBitInNthBinaryString_Optimized {
    public static char findKthBit(int n, int k) {
        // base case
        if(n==1) return '0';
        int length = (int)(Math.pow(2,n))-1;
        int middle = length/2+1;
        if(k==middle) return '1';
        else if(k<middle) return findKthBit(n-1,k);
        else{
            int mirrordx = length-k+1;
            char ch = findKthBit(n-1,mirrordx);
            return ch == '0' ? '1' : '0';
        }
    }
    public static void main(String[] args) {
        int n = 3, k = 5;
        char ch = findKthBit(3,5);
        System.out.println(ch);
    }
}
