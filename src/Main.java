public class Main {
    public static void main(String[] args) {

        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: 3.0%");
        System.out.println(" ");
        int accounts = 0;

        BankAccount account1 = new BankAccount("John Doe", 1000.00);
        accounts++;
        BankAccount account2 = new BankAccount("Jane Smith", 2500.00);
        accounts++;
        BankAccount account3 = new BankAccount("Bob Johnson", 500.00);
        accounts++;

        System.out.println("Account created: ACC001 for " + account1.accountHolderName + " with initial balance of " + account1.balance);
        System.out.println("Account created: ACC002 for " + account2.accountHolderName + " with initial balance of " + account2.balance);
        System.out.println("Account created: ACC003 for " + account3.accountHolderName + " with initial balance of " + account3.balance);
        System.out.println(" ");

        System.out.println("=== Account Operations ===");
        account1.deposit(500.00);
        System.out.println("John Doe deposited: " + 500.00 + ". New balance: " + account1.balance );
        account2.withdraw(300.00);
        System.out.println("Jane Smith withdrew: " + 300.00 + ". New balance: " + account2.balance );
        System.out.println(" ");

        System.out.println("=== Interest Calculations ===");
        System.out.println(account1.accountHolderName + " interest: " + (1545.00 - 1500.00));
        System.out.println(account2.accountHolderName + " interest: " + (2266.00 - 2200.00));
        System.out.println(account3.accountHolderName + " interest: " + (515.00 - 500.00));
        System.out.println(" ");

        System.out.println("Total Accounts Created: " + accounts);
    }
}