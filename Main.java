
import java.util.Scanner;

class AccountHolder {
    private String userId;
    private String userPin;

    public AccountHolder(String userId, String userPin) {
        this.userId = userId;
        this.userPin = userPin;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserPin() {
        return this.userPin;
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        // Add the amount to the balance
    }

    public void withdraw(double amount) {
        // Subtract the amount from the balance
    }

    public void transfer(double amount, Account targetAccount) {
        // Transfer the specified amount to the target account
    }
}

class BankTransaction {
    private String transactionType;
    private double amount;
    private String transactionDate;

    public BankTransaction(String transactionType, double amount, String transactionDate) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }
}

class Bank {
    private String bankName;
    private String bankLocation;

    public Bank(String bankName, String bankLocation) {
        this.bankName = bankName;
        this.bankLocation = bankLocation;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getBankLocation() {
        return this.bankLocation;
    }

    public void addAccount(Account account) {
        // Add the account to the bank's account list
    }

    public void removeAccount(Account account) {
        // Remove the account from the bank's account list
    }

    public void showTransactionHistory(Account account) {
        // Display the transaction history for the account
    }
}

class ATM {
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your user id:");
        String userId = scanner.nextLine();
        System.out.println("Enter your user pin:");
        String userPin = scanner.nextLine();
    

    AccountHolder accountHolder = new AccountHolder(userId, userPin);
    Account account = // Get the account from the bank based on the user id and pin

        if (account == null) {
            System.out.println("Invalid user id or pin");
            return;
        }

    boolean quit = false;while(!quit)
    {
        System.out.println("Choose an option:");
        System.out.println("1. Show transaction history");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                bank.showTransactionHistory(account);
                break;
            case 2:
                System.out.println("Enter the amount to withdraw:");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 3:
                System.out.println("Enter the amount to deposit:");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 4:
                System.out.println("Enter the target account number:");
                String targetAccountNumber = scanner.nextLine();
                System.out.println("Enter the amount to transfer:");
                double transferAmount = scanner.nextDouble();
                Account targetAccount = // Get the target account from the bank based on the account number
                        account.transfer(transferAmount, targetAccount);
                break;
            case 5:
                quit = true;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Sample Bank", "Sample Location");
        ATM atm = new ATM(bank);
        atm.start();
    }
}