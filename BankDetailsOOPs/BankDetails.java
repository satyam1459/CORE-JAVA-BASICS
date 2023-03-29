package BankDetailsOOPs;

public class BankDetails {
    public String name;
    String nickName;
    static int numOfAccounts;
    private int accountNumber;
    String ifsc;
    final static String BANK_NAME = "SBI"; // Final static values identifiers should be in CAPITAL
    double balance;
    double submitAmount;

    public BankDetails(String name, String ifsc) {
        this.name = name;
        this.ifsc = ifsc;
        numOfAccounts++;
        accountNumber = numOfAccounts;
    }

    public BankDetails(String name, String ifsc, String nickName) {
        this.name = name;
        this.ifsc = ifsc;
        this.nickName = nickName;
        numOfAccounts++;
        accountNumber = numOfAccounts;
    }

    public BankDetails(String name, String ifsc, double submitAmount) {
        this.name = name;
        this.ifsc = ifsc;
        this.submitAmount = submitAmount;
        numOfAccounts++;
        accountNumber = numOfAccounts;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double totalBalance() {
        this.balance = balance + this.submitAmount;
        return balance;
    }
}
