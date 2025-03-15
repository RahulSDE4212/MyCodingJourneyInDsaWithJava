package Week_8_StringBuilders;

public class Reverse {
    public static void main(String[] args) {
       StringBuilder sc = new StringBuilder("Raghav");
       int i =0, j = sc.length()-1;
       while(i<=j){
           char ch = sc.charAt(i);
           sc.setCharAt(i,sc.charAt(j));
           sc.setCharAt(j,ch);
           i++;
           j--;
       }
        System.out.println(sc);
    }
}
