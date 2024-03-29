package Unit_9._9_3.bankaccounts;

public class StudentAccount extends Account{
    // Complete this class with Override methods.


    public StudentAccount(int accountNumber, double openingBal){
        super(accountNumber, openingBal);
    }


    // Students get a 10% bonus on depositing
    @Override
    public void deposit(double amount){
        super.deposit(amount * 1.1);
    }

    // Students pay a $1.50 fee for withdrawing
    @Override
    public void withdraw(double amount){
        super.withdraw(amount + 1.5);
    }
    // toString() Should read: Student account current balance $__.__
    @Override
    public String toString(){
        return "Student account current balance $" + getBalance();
    }
}
