package pattern;
import java.util.Scanner;

public class characterPattern
//increasing triangle decrementing rows
{   static void increasingTriangle(int n){
    char p='A';
    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++){
            System.out.print((char)p+" ");
          
        }
          p++;
        System.out.println();
    }
}
//increasing triangle decrementing rows
static void decrementingRows(int n){
    for(int i=1,p='E';i<=n;i++,p--){
        for(int j=1;j<=i;j++){
            System.out.print((char)p+" ");
        }
        System.out.println();
    }
}
//increasingg triangle increment by2 rows;

static void decrementingRows2(int n){
    for(int i=1,p='A';i<=n;i++,p+=2){
        for(int j=1;j<=i;j++){
            System.out.print((char)p+" ");
        }
        System.out.println();
    }
}
//increasing triangle odd rows=A and even=B

static void increasingTriangleOddEven(int n){
    char p='A';
    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++){
            if (i%2!=0)
                System.out.print(p+" ");
            else
                System.out.print((char)(p+1)+" ");
        }
        System.out.println();
    }
}
//decreasing triangle odd=Z even=0
static void decreasingTriangle(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i-1;j++)
            System.out.print("  ");
        for(int j=i;j<=n;j++){
            if (i%2!=0)
                System.out.print("Z"+" ");
            else
                System.out.print("O"+" ");
        }
        System.out.println();
    }
}
// Diamond inc & dec rows
static void diamond(int n){
    char p='A';
   for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            //stars
            for(int j=1;j<=2*i-1;j++)
                System.out.print((char)p+" ");
            System.out.println();
        p++;
        }
        int d=p-2;
        char c=(char)d;
         for(int i=n-1;i>=1;i--)
        {   
            //spaces
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            //stars
            for(int j=1;j<=2*i-1;j++)
                System.out.print((char)c +" ");
                c--;
            System.out.println();
        }
}
//hill triangle increasing and decreasing column
 static void hillPrint(int n){
     for(int i=1;i<=n;i++){
         int p='A';
         for(int j=1;j<=n-i;j++)
             System.out.print("  ");
         for(int j=1;j<=i;j++)
             System.out.print((char)p++ +" ");
            p-=2;       
         for(int j=1;j<=i-1;j++){
           
             System.out.print((char)p-- +" ");}
      System.out.println();
            }
    
 }
 
 static void incstringTri(String s){
    
     int n=s.length();
     for(int i=0,p=0;i<s.length();i++,p++){
         for(int j=0;j<=i;j++)
             System.out.print(s.charAt(p));
        System.out.println();
     }
 }

    
    
public static void main(String[] ar){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    increasingTriangle(n);
     System.out.println("\n");
    decrementingRows(n);
     System.out.println("\n");
    decrementingRows2(n);    
    System.out.println("\n");
    increasingTriangleOddEven(n);
    System.out.println("\n");
    decreasingTriangle(n);
    System.out.println("\n");
    diamond(n);
    System.out.println("\n");
    hillPrint(n);
    System.out.println("\n");
    String s="CODER";
    incstringTri(s);
    }
}
