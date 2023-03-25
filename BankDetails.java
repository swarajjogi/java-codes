
import java.util.*;

class Bank_Account {
    int Account_no;
    String Name_of_Depositor;
    String type_of_Account;
    int balance;

    Bank_Account(int Account_no, String Name_of_Depositor, String type_of_Account, int balance) {
        this.Account_no = Account_no;
        this.Name_of_Depositor = Name_of_Depositor;
        this.type_of_Account = type_of_Account;
        this.balance = balance;
    }
}

public class BankDetails {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Account no: ");
            int Account_no = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Name of Depositor: ");
            String Name_of_Depositor = sc.nextLine();
            System.out.println("Enter the Type of Account: ");
            String type_of_Account = sc.nextLine();
            System.out.println("Enter the Balance of Depositor: ");
            int balance = sc.nextInt();
            System.out.println("Enter the Amount to deposit: ");
            int a = sc.nextInt();
            System.out.println("Enter the Amount to withdraw: ");
            int b = sc.nextInt();
            Bank_Account obj = new Bank_Account(Account_no, Name_of_Depositor, type_of_Account, balance);
            System.out.println("Details are:");
            System.out.print("Account No: ");
            System.out.println(obj.Account_no);
            System.out.print("Name: ");
            System.out.println(obj.Name_of_Depositor);
            System.out.print("Type of Account:");
            System.out.println(obj.type_of_Account);
            System.out.print("Balance:");
            System.out.println(obj.balance);
            System.out.print("Balance After Deposited:");
            System.out.println(obj.balance + a);
            System.out.print("Balance After withdraw: ");
            System.out.println(obj.balance + a - b);
        }

    }
}