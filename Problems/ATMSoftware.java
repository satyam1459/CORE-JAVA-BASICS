import java.util.*;

public class ATMSoftware
{
    public static void main(String[] args){
        //initial bank balance
        Scanner sc=new Scanner(System.in);
        int totalAmount=10000;
        // type of operation--> credit or debit 
        // 1--> Credit to bank 2--> Debit to bank
        
        System.out.println("Enter 1---> Credit \n    2-->Debit");
        int oper=sc.nextInt();
        
        System.out.println("Enter amount to be credited or debited");
        int amount=sc.nextInt();
        
        if(oper==1){
            //credit here
            totalAmount+=amount;
            System.out.println("Total bank balance ="+ totalAmount);
        }
        else if(oper==2){
            if(amount>totalAmount)
                System.out.println("Insufficient funds");
            else{
                totalAmount-=amount;
                System.out.println("Total amount left = "+totalAmount);
            }
            
            
        }
    }
}
