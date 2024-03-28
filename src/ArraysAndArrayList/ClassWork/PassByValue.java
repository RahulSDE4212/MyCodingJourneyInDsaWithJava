/* *********************** pass by Value ******************
* 1) Basically when we pass String,int, double,char,boolean to a method in java.
*    then they are passed by value
* */

package ArraysAndArrayList.ClassWork;
import java.util.*;
public class PassByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10;
        System.out.println(num);
        change(num);
        System.out.println(num);
    }

    public static void change(int num){ // pass by value
        num = 17;
    }
}
