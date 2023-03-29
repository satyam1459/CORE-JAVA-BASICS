import java.util.Scanner;

public class binaryToDecimal
{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ans=0;
   int pw=1; //here pw is power of two,initially it will be 2^0=1
   while(n>0){
       int digit=n%10;
       if(digit==1 || digit==0){
       ans+=pw*digit;
       
       n/=10;
       pw*=2;}
       
       else{
       System.out.println("Not a binary number");
    return;
}
    }
    System.out.println(ans);
   }
}
