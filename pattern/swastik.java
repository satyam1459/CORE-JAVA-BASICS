package pattern;


import java.util.Scanner;
public class swastik
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1 || j==n/2+1||(i==1 &&j>=n/2+1)||(i==n &&j<=n/2)||(j==1 && i<=n/2)|| (j==n&&i>=n/2+1))
                 System.out.print("* ");
                else
                    System.out.print("  ");
                    
            }
            System.out.println();
        }
    }
}