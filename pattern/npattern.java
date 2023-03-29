package pattern;
import java.util.*;


public class npattern
{
   public static void main(String[] ar){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       for(int i=1;i<n+1;i++){
           for(int j=1;j<=n+2;j++){
               if(j==1 || j==n+2 || j==i+1)
                   System.out.print("*");
                else
                   System.out.print(" ");
           }
           System.out.println();
       }
   }
}
