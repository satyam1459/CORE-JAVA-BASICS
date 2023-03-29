package pattern;

import java.util.*;
public class increasingNumber
{  static void increasingNumber(int n)
    {
        
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%2d",k);
                System.out.print(" ");
                k++;
            }
            System.out.println();
        }
    
    }
    static void increaseBy2(int n){
        int k=2;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%2d",k);
                System.out.print(" ");
                k+=2;
            }
            System.out.println();
        }
    
    }
    static void rowMultiply(int n){
        int k=1;
         for(int i=1;i<=n;i++){
             k=i;
            for(int j=1;j<=n;j++){
                System.out.printf("%2d",(k));
                System.out.print(" ");
                k+=n;
               
            }
            System.out.println();
        }
    
    }
     static void tableRow(int n){
        
         for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.printf("%3d",(i*j));
                System.out.print(" ");
               
            }
            System.out.println();
        }
    
    }
    static void increaseCol(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            k=i;
            for(int j=1;j<=n;j++){
                System.out.printf("%3d",k);
                k+=n;
            }
            
            System.out.println();
        }
    }
    static void decreasingColNum(int n){
        int x;
        for(int i=1;i<=n;i++){
            x=n-i+1;
            for(int j=1;j<=n;j++){
                System.out.printf("%3d",x);
                x+=n; 
            }
            System.out.println();
        }
    }
    
    static void incDecCol(int n){
        int x;
        int y;
        for(int i=1;i<=n;i++){
            x=i;
            y=n-i+1;
            for(int j=1;j<=n;j++){
            if(j%2==0)
                System.out.printf("%3d",x);
            else
                System.out.printf("%3d",y);
                x=x+n;
                y=y+n;
            }
                 System.out.println(); 
        }
           
    }
    
public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
       /* increasingNumber(n);
         increaseBy2(n);
        rowMultiply(n);
        increaseCol(n);
        decreasingColNum(n);*/
        incDecCol(n);
    }
}
