import java.util.Scanner;

class num{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number upto which you want to print");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
         System.out.println(i);
    }
}