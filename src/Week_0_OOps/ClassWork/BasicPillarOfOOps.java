package Week_0_OOps.ClassWork;
import java.util.*;
class Account{
    // this is data-hiding as we do not want unauthenticated access of balance
    private double balance;
    private double account = 2211276;
    private String pass = "22scse";
    // public methods
    public void setBalance(double balance){
        // validating authentication
        boolean bool = validate();
        if(bool){
            this.balance = this.balance + balance;
            System.out.println("credited to account");
        }
        else {
            System.out.println("wrong password/account number.....");
        }
    }
    public double getBalance(double balance){
        // validating authentication
        boolean bool = validate();
        if(bool){
            if(this.balance<balance){
                System.out.println("Insufficient balance....");
                return 0.0f;
            }
            else{
                this.balance = this.balance - balance;
                System.out.println(balance + "has been credited...");
                return balance;
            }
        }
        else{
            System.out.println("wrong password/account number......");
        }
        return 0.0f;
    }
    public boolean validate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter account number: ");
        double account = sc.nextDouble();
        if(!(account == this.account)) return false;
        System.out.println("pls enter password: ");
        String pass = sc.next();
        if(!(this.pass.equals(pass))) return false;
        return true;
    }
}
public class BasicPillarOfOOps {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setBalance(2000);
        ac.getBalance(1000);
    }
}
