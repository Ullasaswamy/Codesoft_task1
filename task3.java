import java.util.*;

public class task3 {
    private double Balance;
    
    public task3(double Balance){
        this.Balance=Balance;
    }

    public double checkBalance(){
        return Balance;
    }

    public void Deposit(double Amount){
        if(Amount>0){
            Balance+=Amount;
            System.out.println("Deposit of INR "+Amount+" successfull.");
            System.out.println("Current Balance : INR "+Balance);
        }
        else{
            System.out.println("Invalid Deposite Amount!.");
        }
    }
    public void Withdraw(double Amount){
        if(Amount>0 && Amount<=Balance){
            Balance-=Amount;
            System.out.println("Withdraw of INR "+Amount+" successful.");
            System.out.println("Current Balance : INR "+Balance);
        }
        else{
            System.out.println("Insufficient Balance!.");
        }
    }
}
class Atm{
    private task3 BankAccount;

    public Atm(task3 BankAccount){
        this.BankAccount=BankAccount;
    }

    public void DisplayMenu(){
        System.out.println(" ATM Menu ");
        System.out.println("1) Check Balance :");
        System.out.println("2) Deposite :");
        System.out.println("3) Withdraw :");
        System.out.println("4) Exit.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int ch=sc.nextInt();
   
        switch (ch) {
            case 1:
                System.out.println("Current balance : INR "+BankAccount.checkBalance());
                break;
            case 2:
                System.out.println("Enter Deposit Amount : INR ");
                double depAmount=sc.nextInt();
                BankAccount.Deposit(depAmount);
                break;
            case 3:
                System.out.println("Enter withdraw Amount : INR ");
                double witAmount=sc.nextInt();
                BankAccount.Withdraw(witAmount);
                break;
            case 4:
                System.out.println("Exiting ATM.");
                sc.close();
                System.exit(0);    
            default:
                System.out.println("Invalid choice Entered!..");
                break;
        }
    }
}
class ATM_Interface{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Initial Account Balance : INR ");
        double intBalance=sc.nextInt();
        task3 BankAcc=new task3(intBalance);

        Atm atm=new Atm(BankAcc);

        while (true) {
            atm.DisplayMenu();
            System.out.println("Select an option :"); 
        }
    }
}