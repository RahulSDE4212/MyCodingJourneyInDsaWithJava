package Week_2_Conditional;
import java.util.*;
public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();

        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 !=0);

        if(month == 2)
        {
            if(leap) System.out.println("february "+ year + " has 29 days: ");
            else System.out.println("february "+ year + " has 28 days: ");
        }
        else if(month == 1) System.out.println("January "+ year + " has 31 days: ");
        else if(month == 3) System.out.println("march "+ year + " has 31 days: ");
        else if(month == 4) System.out.println("April "+ year + " has 30 days: ");
        else if(month == 5) System.out.println("may "+ year + " has 31 days: ");
        else if(month == 6) System.out.println("june "+ year + " has 30 days: ");
        else if(month == 7) System.out.println("july "+ year + " has 31 days: ");
        else if(month == 8) System.out.println("august "+ year + " has 31 days: ");
        else if(month == 9) System.out.println("sept "+ year + " has 30 days: ");
        else if(month == 10) System.out.println("oct "+ year + " has 31 days: ");
        else if(month == 11) System.out.println("nov "+ year + " has 30 days: ");
        else if(month == 12) System.out.println("de  "+ year + " has 31 days: ");
    }
}
