package Conditional;
import java.util.*;
public class GradeOfSteel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hardness of the steel: ");
        int hardness = sc.nextInt();

        System.out.println("Enter the carbon content: ");
        float carbonContent = sc.nextFloat();

        System.out.println("Enter the tensile strength: ");
        int tensileStrength = sc.nextInt();

        if(hardness>50 && carbonContent<0.7 && tensileStrength>5600){
            System.out.println("Grade is: " + 10);
        }
        else if(hardness>50 && carbonContent<0.7){
            System.out.println("Grade is: " + 9);
        }
        else if(carbonContent<0.7 && tensileStrength>5600){
            System.out.println("Grade is: "+ 8);
        }
        else if(hardness>50 && tensileStrength>5600){
            System.out.println("Grade is: " + 7);
        }
        else if(hardness>50 || carbonContent<0.7 || tensileStrength>5600){
            System.out.println("Grade is: "+6);
        }
        else {
            System.out.println("Grade is" + 5);
        }
    }
}
