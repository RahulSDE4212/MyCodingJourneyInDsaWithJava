package Recursion.ClassWork;

public class SkipACharacter {
    public static void skip(int i, String s,String t){
        if(i==s.length()){
            System.out.println(t);
            return;
        }
        //if(s.charAt(i)!='a') t += s.charAt(i);
        if(s.charAt(i)!= 'a') skip(i+1,s,t+s.charAt(i));
        else skip(i+1,s,t);
    }
    public static void main(String[] args) {
        String s = "Rahul";
        skip(0,s,"");
    }
}
