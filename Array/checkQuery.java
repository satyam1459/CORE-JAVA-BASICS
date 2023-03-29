package Array;
import java.util.*;

/**
 * Given Q queries, check if the given number is present in the array or not
 * Value of all the elements in the array is less than 10 to the power of 5.
 */
public class checkQuery
{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int[] a={1,2,3,4,5,6,7,8,9};
       
       //This frequency array will store all values freq of array a.
       int[] freqArray=new int[100001];
       for(int i=0;i<a.length;i++){
           freqArray[a[i]]+=1;
       }
       
       System.out.println("Enter number of queries: ");
       int q=sc.nextInt();
       while(q>0){
           System.out.println("Enter number to be searched : ");
           int x=sc.nextInt();
           if(freqArray[x]>0)   System.out.println("Yes");
           else                 System.out.println("No");
           q--;
       }
    }
}
