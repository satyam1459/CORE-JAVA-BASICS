import java.util.*;
/**
 * Write a description of class checkPower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class checkPower
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println("Not power of 2");
        while(n!=1){
            if(n%2!=0)
                System.out.println("Not power of 2");
          
            else
              System.out.println("Yes power of2");
              n=n/2;
        }
      
    }
}

