import java.util.*;

class BankAccount{
    double balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    public void withdraw(int amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("Erorr : Insufficient balance");
        }else {
            balance-=amount;
        }
    }
    public void balance(){
        System.out.println("Your Balance is : " + balance);
    }
}
public class Bank{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount you want to withdraw : ");
        int amount = sc.nextInt();
        BankAccount b = new BankAccount(5000);
        try{
            b.withdraw(amount);
            b.balance();
        }catch(InsufficientFundsException e){
           
            System.out.println(e.getMessage());
        }
        
      
    }
}