import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args){
    int n,x=0,y=1,z=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number upto which Fibonacci Series you want: ");
    n=sc.nextInt();
    for(z=0;z<=n;x++)
    {
        System.out.println(z);
        x=y;
        y=z;
        z=x+y;
    }
    }
}