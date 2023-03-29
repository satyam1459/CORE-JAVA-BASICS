import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        //Taking element input of array
        for(int i=0;i<n;i++)
            ar[n]=sc.nextInt();
        
        //Insertion sort
      
        for(int i=1;i<n;i++){
            int temp=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>temp){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=temp;
        }
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}