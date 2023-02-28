package Unit_9._9_3.bankaccounts;

public class BankTester {
    public static void main(String[] args) {
        // Create a new account
        Account myAccount = new Account(1234, 1000.00);
        // Deposit $100
        myAccount.deposit(100.00);
        // Withdraw $200
        myAccount.withdraw(200.00);
        // Print the balance
        System.out.println(myAccount);
        System.out.println(myAccount);
    }
}
