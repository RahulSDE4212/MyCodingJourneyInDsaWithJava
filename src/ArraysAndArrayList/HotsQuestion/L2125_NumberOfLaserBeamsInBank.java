package ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class L2125_NumberOfLaserBeamsInBank {
    public static int numberOfBeams(String[] bank) {
        int ans = 0;
        int poc = 0; // pichle row me kitna 1 hai wo store karega
        for(String s: bank){
            int coc = 0;// present row me(s string me) kitna 1 hai wo store karega
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1') coc++;
            }
            if(coc>0){ // yadi present row me no. of 1s > 0 hai tabhi poc ko update karo
                ans = ans + coc * poc;
                poc = coc;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] bank = {"011001","000000","100100","001000"};
        int count = numberOfBeams(bank);
        System.out.println(count);
    }
}
