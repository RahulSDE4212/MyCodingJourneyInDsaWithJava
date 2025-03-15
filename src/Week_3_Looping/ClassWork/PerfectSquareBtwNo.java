package Week_3_Looping;

import java.util.Scanner;

public class PerfectSquareBtwNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i*i < 1000){
            System.out.print((i*i) + " ");
            i++;
        }
    }
}
