package Week_7_Strings.ExtraQuestion;

public class L415_AddString {
    public static  String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 && j>=0){
            int n1 = num1.charAt(i)-'0';
            int n2 = num2.charAt(j)-'0';
            int sum = n1 + n2 + carry;
            sb.insert(0,sum%10);
            carry = sum / 10;
            i--;
            j--;
        }
        while(i>=0){
            int n1 = num1.charAt(i)-'0';
            int sum = n1 + carry;
            sb.insert(0,sum%10);
            carry = sum / 10;
            i--;
        }
        while(j>=0){
            int n2 = num2.charAt(j)-'0';
            int sum = n2 + carry;
            sb.insert(0,sum%10);
            carry = sum / 10;
            j--;
        }
        if(carry!=0) sb.insert(0,carry);
        return sb.toString();
    }
    public static  String addStrings2(String num1, String num2) { // optimized approach
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            int n1 = (i>=0) ? num1.charAt(i)-'0':0;
            int n2 = (j>=0) ? num2.charAt(j)-'0':0;
            int sum = n1 + n2 + carry;
            sb.append(sum%10);
            carry = sum / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "23456";
        String ans = addStrings(num1,num2);
        System.out.println("the ans is: " + ans);
    }
}
