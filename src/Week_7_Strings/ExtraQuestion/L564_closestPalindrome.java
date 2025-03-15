package Week_7_Strings.ExtraQuestion;

public class L564_closestPalindrome {
    public static long generatePalindrome(long num, boolean even){
        long number = num;
        if(!even) num = num /10;
        while(num!=0){
            long rem = num % 10;
            number = number *10 + rem;
            num = num / 10;
        }
        return number;
    }
    public static String nearestPalindromic(String n) {
        int length = n.length();
        long number = Long.parseLong(n);// converting string into long
       // System.out.println(number);
        if(number <= 10) return Long.toString(number-1);// if our number is <=10 10 then number-1 will be our ans
        if(number == 11) return Long.toString(9);

        // i am converting left half of the string n into long datatype
        long leftHalf = Long.parseLong(n.substring(0,(n.length()+1)/2));
        /*
        Creating candidates array of integer type to store 5 values.
        1) the palindrome that i get after mirroring left half of the String n
        2) the palindrome that i get after mid +1
        3) the value that i get after mid -1
        4) the number of 9s of length = n.length()-1
        5) the number starting with 1+middle 0s + 1 with length = n.length()+1
        */
        long[] candidates = new long[5];
        candidates[0] = generatePalindrome(leftHalf,length%2==0);
        candidates[1] = generatePalindrome(leftHalf+1,length%2==0);
        candidates[2] = generatePalindrome(leftHalf-1,length%2==0);
        candidates[3] = (long)Math.pow(10,n.length()-1)-1;
        candidates[4] = (long)Math.pow(10,n.length())+1;

        for(long ele:candidates){
            System.out.println(ele + " ");
        }
        System.out.println();
        // checking which number is closest to String n
        long closest = (long)0;
        long minDiff = Long.MAX_VALUE;
        for(int i=0;i<candidates.length;i++){
            if(candidates[i]  == number) continue;
            System.out.println("closest is: " + closest);
            System.out.println("mindiff is: " + minDiff);
            long diff = (long)(candidates[i]-number);
            if(diff<0) diff = diff * -1;
            System.out.println("diff is "+diff);
            if(diff<minDiff){
                closest = candidates[i];
                minDiff = diff;
            }
        }
        //System.out.println(closest);
//        for(Long ele:candidates){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
        return Long.toString(closest);
    }
    public static void main(String[] args) {
        String num = "358764513820540928";
        String ans = nearestPalindromic(num);
        System.out.println();
        System.out.println(ans);
    }
}
