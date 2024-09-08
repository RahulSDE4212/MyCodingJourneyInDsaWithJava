package Strings.ExtraQuestion;

public class L65_ValidNumber {
    public static boolean isNumber(String s) {
        boolean exp = false; // represent kar rha hai ki exponent pehle se present hai ki nhi.
        boolean digit = false; // represent kar rha hai ki digit pehle se present hai ki nhi.
        boolean dot = false; // represent kar rha hai ki dot pehle se present hai ki nhi.
        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i); // harek character ko ek-ek karke fetch karega
            if(isDigit(ch)){
                // if ch is digit then turns digit to true;
                digit = true;
            }
            else if(ch == '-' || ch == '+'){
                // if there is the presence of - or + sign then it should only be followed by a exponent.
                if((i>0 && s.charAt(i-1) != 'E') && (i>0 && s.charAt(i-1) != 'e')) return false;
            }
            else if(ch == 'e' || ch == 'E'){
                /*
                 if exponent sign is present.
                    -> then check that there should be presence of exponent sign already.
                    -> then check that there must be digit present in the string before exponent sign.
                 */
                if(exp || !digit) return false;
                exp = true;
                digit = false;
            }
            else if(ch == '.'){
                /*
                    if dot sign is present
                        -> then check that there should not be presence of dot sign already.
                        -> then check that there should not be presence of exponent sign already
                 */
                if(exp || dot) return false;
                dot = true;;
            }
            else return false;
            i++;
        }
        return digit;
    }
    public static boolean isDigit(char ch){
        if(ch >= '0' && ch <= '9') return true;
        return false;
    }
    public static void main(String[] args) {
        String num = "asvf";
        boolean bool = isNumber(num);
        System.out.println(bool);
    }
}
