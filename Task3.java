import java.util.Scanner;

class BankAccount{
    public double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }
    public double getbalance(){
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public boolean Withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }
        else{
            return false;
        }
    }
}

class AtmMachine{
    public BankAccount userAccount;
    
    public AtmMachine(BankAccount account){
        this.userAccount = account;
    }
    public void display(){
        System.out.println("<---ATM Options--->\n");
        System.out.println("WithDraw");
        System.out.println("Deposit");
        System.out.println("CheckBalance");
        System.out.println("Exit");
    }

    public void performTransactions(int Options){
        Scanner sc = new Scanner(System.in);
        switch (Options) {
            case 1:
                System.out.println("Enter the withdrawl ammount : $");
                double withDrawAmmount = sc.nextDouble();
                if(userAccount.Withdraw(withDrawAmmount)){
                    System.out.println("WithDrawl Successful,Remaining Balance is : $" +userAccount.getbalance());
                }
                else{
                    System.out.println("Insufficience Balance,WithDrawl failed...");
                }
                break;
            case 2:
            System.out.println("Enter the deposit ammount : $");
            double DepositAmmount = sc.nextDouble();
            userAccount.deposit(DepositAmmount);
            System.out.println("deposit Successful.New Balance is : $" +userAccount.getbalance());
                break;
            case 3:
            System.out.println("Current Balance is : $ " +userAccount.getbalance());
                break;
            case 4:
            System.out.println("You are Exit");
            System.exit(0);
                break;
            default:
            System.out.println("Invalid Option,Please try again..");
        }         
    }
}
public class Task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial account balance : $");
        double AccountBalance = sc.nextDouble();
        BankAccount userAccount = new BankAccount(AccountBalance);
        AtmMachine atm = new AtmMachine(userAccount);
        while (true) {
            atm.display();
            System.out.print("Enter your choice from 1-4: ");
            int choice = sc.nextInt();

            atm.performTransactions(choice);
        }
    }
}