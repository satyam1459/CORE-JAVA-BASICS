package pattern;
import java.util.Scanner;


class pascalTriangle
{
    static int fact(int n){
        int fact=1;
        for(;n>=1;n--){
            fact=fact*n;
        }
        return fact;
        
    }
    
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows : ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++)
            System.out.print("  ");
        for(int j=1;j<=i;j++)
        {
            int d=fact(i-1)/(fact(j-1)*fact(i-j));
            System.out.printf("%4d",d);
        }
        System.out.println();
    }
    }
}
