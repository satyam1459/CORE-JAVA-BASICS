package BankDetailsOOPs;

import javax.xml.transform.Source;

public class BankDetailsUse {
    public static void main(String[] args) {
        BankDetails p1 = new BankDetails("Satyam", "Sbi0020");
        BankDetails p2 = new BankDetails("Rahul", "Sbi0020", 1000);
        System.out.println(p2.totalBalance());
        System.out.println(BankDetails.BANK_NAME);
        System.out.println(p1.BANK_NAME);
        System.out.println(p2.BANK_NAME);

        System.out.println(BankDetails.numOfAccounts);
        System.out.println(p1.numOfAccounts);
        System.out.println(p1.getAccountNumber());
        System.out.println(p2.getAccountNumber());
    }
}
