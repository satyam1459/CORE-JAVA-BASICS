package Array;

import java.util.Scanner;

public class array
{
    
 public static void main(String[] ar){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of array:");
     int size=sc.nextInt(); 
      System.out.println("Enter the row of array:");
     int row=sc.nextInt();
    // oneD(size);
     twoD(size,row);
 }
 static void oneD(int n){
     int[] a=new int[n];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the elements of array: ");
     for(int i=0;i<a.length;i++){
       a[i]=sc.nextInt();        
     }
     for(int i=0;i<a.length;i++)
         System.out.print(a[i]+" ");
 }
 static void twoD(int n,int m){
     int[][] a=new int[m][n];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the elements of array: ");
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++)
               a[i][j]=sc.nextInt();        
     }
     for(int i=0;i<a.length;i++){
          for(int j=0;j<a[i].length;j++)
              System.out.print(a[i][j]+" ");
      System.out.println();
            }
             
 }
}
