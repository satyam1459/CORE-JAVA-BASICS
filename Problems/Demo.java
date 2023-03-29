
import java.util.Scanner;
class Demo{
     public static void main(String[] args){
         Programs aa=new Programs();
         int ch;
         do{
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your choice:\n 1->Addition of digits \n2->Product of digits \n3->Reverse of digit \n4->Palindrome checking \n5->Factorial \n6->Fibonacci \n7->Prime number \n8->Armstrong \n9->X to power Y \n10->Table \n11->Exit: ");
         ch=sc.nextInt();
         switch(ch)    //switch case helps to implement choice
         {
             case 1:
                 aa.getdata();
                 aa.sumofdigits();
                 break;
             case 2:
                 aa.getdata();
                 aa.prodofdigits();
                 break;
             case 3:
                 aa.getdata();
                 aa.reverse();
                 break;
            case 4:
                aa.getdata();
                aa.palin();
                break;
             case 5:
                 aa.getdata();
                 aa.factorial();
                 break;
             case 6:
                 aa.getdata();
                 aa.fibonacci();
                 break;
            case 7:
                aa.getdata();
                aa.prime();
                break;
            case 8:
                aa.getdata();
                aa.armstrong();
                break;
            case 9:
                aa.power();
                break;
            case 10:
                aa.getdata();
                aa.table();
                break;
            case 11:
                break;
             default :
                 System.out.println("Invalid Choice");
                 break;
         }
        
        }while (ch!=11);
    }
 }



 class Programs{
     int i;
     void getdata()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number: ");
         i=sc.nextInt();
     }
     void sumofdigits()
     {
     int sum=0;
     while(i>0){
         sum=sum+i%10;
         i=i/10;
     }
     System.out.println("Sum of digits= "+sum);
     }
     void prodofdigits()
     {
     int pro=1,d;
     while (i>0)
     {   d=(i%10);
         pro=pro*d;
         i=i/10;
         System.out.println(" digits = "+pro);
     }
     System.out.println("Product of digits = "+pro);
     }
     void reverse()
     {
         int rev=0;
         while(i>0){
             rev=(rev*10)+(i%10);
             i/=10;
         }
         System.out.println("Reverse of number= "+rev);
     }
     void palin()
     {
         int x,rev=0;
         x=i;
         while (x!=0){
             rev=(rev*10)+(x%10);
             x/=10;
         }
         if(i==rev)
         System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
     }
     void factorial()
     {
         int fac=1;
         while(i>0)
         {
             fac=fac*i;
             i--;
         }
         System.out.println("Factorial of number"+fac);
     }
     void fibonacci()
     {
         int x=0,y=1,z=0;
         while (z<=i)
         {  System.out.println(z);
             x=y;
             y=z;
             z=x+y;
         }
     }
     void prime()
     {
        int x,count=0;
        if(i==1)
            System.out.println("1 is neither prime nor composite");
        for(x=1;x<=i;x++)
        {
            if(i%x==0)
                count++;
        }
        if(count==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime i.e., Composite");
     }
     void armstrong()
     {
         int x,y,count=0,sum=0,pro=1;
         x=i;
         y=i;
         while(x!=0){
             count++;
             x/=10;
         }
         while(i>0)
         {
             int digit=i%10;
             for(int j=1;j<=count;j++)
                 pro=pro*digit;
             sum=sum+pro;
             i/=10;
         }
         if(sum==y)
         System.out.println("Armstrong number");
         else
         System.out.println("Not Armstrong");
     }
     void power()
     {
       int b,j ,x,y,pro=1;
      Scanner sc1=new Scanner(System.in);   
      System.out.println("Enter base: ");
      x=sc1.nextInt();
      System.out.println("Enter power: ");
      y=sc1.nextInt();
      j=y;
      b=x;
      while(y>0)
      {
      pro=pro*x;    
      y--;
      }
      System.out.println("Value of "+b+"raised to power of "+j+" ="+pro );
    }
    void table()
    {   System.out.println("Table of "+i);
        for(int j=1;j<=10;j++)
         System.out.println(i+" * "+j+" = "+i*j);
 
    }
}
 
 