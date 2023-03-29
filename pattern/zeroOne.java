package pattern;

import java.util.Scanner;
public class zeroOne
{
    static void firstZero(int n){
     for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print((i+j)%2+" ");
            System.out.println();
        }        
    }
    
    static void firstOne(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print((i+j+1)%2+" ");
            System.out.println();
        }
    }
    
    static void evenColZero(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print((i*j)%2+" ");
            System.out.println();
        }
    }
    
    static void oddColZero(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j%2==0)
                    System.out.print((i+j)%2+" ");
                else
                    System.out.print(0+" ");
                
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        firstZero(n);
        System.out.println();
        firstOne(n);
        System.out.println();
        evenColZero(n);
        System.out.println();
        oddColZero(n);
    }
}
