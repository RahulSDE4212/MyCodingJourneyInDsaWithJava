package Looping;
import java.util.*;
public class AlphabetPrinting {
    public static void main(String[] args) {
        System.out.println(" smallcase alphabet : ");
        for(int i = 97;i<=122;i++){
            System.out.print((char)i + " ");
        }
        System.out.println();

        System.out.println("UpperCase alphabet: ");
        for(int i = 65;i<=90;i++){
            System.out.print((char)i + " ");
        }
    }
}
