package ATMMachine;

import java.util.Scanner;

class ATMMachine {
    public Scanner sc = new Scanner(System.in);
    float Balance;
    int PIN = 5674;

    // Code Run--> We have to get msg--> Enter your PIN...
    public void checkPin() {
        System.out.println("Enter your pin: ");
        int enterpin = sc.nextInt();

        if (enterpin == PIN)
            menu();
        else {
            System.out.println("Enter a valid pin ..!!!  Try again-->");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("Enter your choice-->");
        System.out.println(
                "1. Check A/C balance" + "\n" + "2. Withdraw Money" + "\n" + "3. Deposit Money" + "\n" + "4. EXIT");

        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a volid choice");
            menu();
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to Withdraw-->");
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient funds....!!!!");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawn Successfully...!!!");
        }
        menu();

    }

    public void depositMoney() {
        System.out.println("Enter the amount to deposit: ");
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited succesfully....!!!!");
        menu();
    }

}

public class ATM {
    public static void main(String[] args) {
        ATMMachine obj = new ATMMachine();
        obj.checkPin();
    }
}
