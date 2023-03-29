import java.util.Scanner;

public class pyramidHollowPattern{
    static void patternParallel(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        
        }}
   /*    static void patternCross(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==n/2+1||i==n/2+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        
    }*/
   /*  static void patternDiagonal(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i|| i+j==n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        
    }*/
 /*    static void patternHollow(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n ||j==1|| j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        
    }*/
     //Hollow Increasing Triangle   
    static void patternHollowTri(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==n || j==1 ||j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        
    }}
    //Hollow Decreasing Triangle
    /*static void patternHollowTri(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                if(i==1 || j==1 ||j+i==n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        
    } */
    //Hollow Hill pattern
    
     public static void HollowHill(int n)
    {
        for(int i=1;i<=n;i++)             //outer loop
        {    //inner loo
            for(int j=i;j<=n;j++)               //inner loop outer space
                 System.out.print("  ");
            for(int j=1;j<i;j++){
                if(i==n || j==1)
                    System.out.print("* ");           //outer star 1st part
                else
                    System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(i==n|| j==i)                            //outer star 2nd part
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }    
    }
    
   
    
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int n=sc.nextInt();
    //pattern1(n);
    HollowHill(n);
    System.out.println();
    patternParallel(n);
     System.out.println();
     patternHollowTri(n);
    }
}
