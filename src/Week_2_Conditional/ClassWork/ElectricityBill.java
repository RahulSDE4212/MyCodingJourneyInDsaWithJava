package Week_2_Conditional;
import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        System.out.println("Enter the unit of electricity bill: ");
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        double electriciyBill;

        if(unit>=0 && unit<=50) {
            electriciyBill = unit * 0.50;
            electriciyBill = 0.2 * electriciyBill + electriciyBill;
        }
        else if(unit>=50 && unit<=200) {
            electriciyBill = 50 * 0.50 + (unit - 50) * 0.75;
            electriciyBill = 0.2 * electriciyBill + electriciyBill;
        }
        else if(unit>=200 && unit<=450){
            electriciyBill = 50*0.50 + 150*0.75 + (unit-200)*1.20 ;
            electriciyBill = 0.2 * electriciyBill + electriciyBill;
        }
        else{
            electriciyBill = 50*0.50 + 150*0.75 + 250*1.20 + (unit-450)*1.50;
            electriciyBill = 0.2 * electriciyBill + electriciyBill;
        }

        System.out.println("Your electricity bill is: " + electriciyBill) ;
    }
}
