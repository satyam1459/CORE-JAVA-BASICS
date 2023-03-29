import java.util.Scanner;

public class swapWithoutVariable
{
    public static void main(String[] ar){
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value for A: ");
        a=sc.nextInt();
        System.out.print("Enter value for B: ");
        b=sc.nextInt();
        
        System.out.println("Value of A and B before swapping is A : "+a+"B :"+b );
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("Value of A and B after swapping is A: "+a+"B :" +b);
    }
}
