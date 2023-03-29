import java.util.Scanner;
public class bitWiseOperator
{
   public static void main(String [] args){
   int n=5;                //0101
        int pos=2;
        int bitMask=1<<pos;
        if((bitMask &n)==0)
            System.out.println("bit was zero");
        else
            System.out.println("bit was one");
//set bit            
int n1=5;
int pos1=1;
int bitMask1=1<<pos1;
 int newNumber=bitMask1 | n1;
 System.out.println(newNumber);
//clear bit
 int n2=5;
 int pos2=2;
 int bitMask2=1<<pos2;
 int notnewNumb= ~bitMask2;
 int newNumber2=notnewNumb &n2;
 System.out.println(newNumber2);
 
 Scanner sc=new Scanner(System.in);
 int Oper=sc.nextInt();
 int n3=5;
 int pos3=1;
 int bitMask3=1<<pos3;
  
 if(Oper==1){
     //setBit
     int newNumber3=bitMask3|n3;
         System.out.println(newNumber3);}
else 
{
         //clearBit
         int newBitMask4= ~bitMask3;
         int newNumber4=newBitMask4 & n3;
         System.out.println(newNumber4);
     }
 }
}
 
 
 
 
 
