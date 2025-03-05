public class BankAccount {
    // Attributes
    int accountNumber;
    String accountHolderName;
    double balance;

    //Parameterized Constructor
    BankAccount(int _accountNumber, String _accountHolderName, double _balance){
        this.accountNumber = _accountNumber;
        this.accountHolderName =_accountHolderName;
        this.balance = _balance;
    }

      //Deposit Method
      void deposit(double amount){
         if(amount > 0 ){
            balance += amount;        //Balance = balance + amount
            System.out.println("Deposited Amount: NPR" + amount);
         }
         else{
            System.out.println("Invalid amount");
         }
      }

      //Withdraw Method
      void withdraw( double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;                  //Balance = balance - amount
            System.out.println("Withdraw Amount: NPR" + amount);
        }
        else if(amount > 0){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Invalid Amount");
        }
      }
 
      //Display Balance method
      void displayBalance(){
        System.out.println("Account Holder Name:" + accountHolderName);
        System.out.println("Balance: NPR" + balance);
      }

      public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(1001, "Shuveksha Gurung", 5000);
        bankAccount1.deposit(1000);
        bankAccount1.withdraw(500);
        bankAccount1.displayBalance();

        System.out.println("----------------------------------");
         
        BankAccount bankAccount2 = new BankAccount(1002, "Cherish Gurung", 2000);
        bankAccount2.deposit(300);
        bankAccount2.withdraw(100);
        bankAccount2.displayBalance();
      
      }
}
