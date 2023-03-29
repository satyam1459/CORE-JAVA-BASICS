import java.util.Scanner;

public class assignment1
{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      int x=sc.nextInt();
      System.out.println("Enter second number");
      int y=sc.nextInt();
      System.out.println("Divide : "+ x/y);
      System.out.println("Multiply : "+ x*y);
      System.out.println("Subtraction : "+ (x-y));
      System.out.println("Addition : "+ x+y);
    }
}
