package Array;

import java.util.Scanner;

/**
 *Given an int array 'a' sorted in non-decreasing order ,return an array of the squares of each number sorted in non-decreasing order  
 **/
public class sortSquares
{
    static int[] sort_Squares(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
      
        int[] ans=new int[n];
          int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right]))    {
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;}
        }
        return ans;
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] ar=new int[n];
    for(int i=0;i<n;i++)    ar[i]=sc.nextInt();
    
    int[] ans=sort_Squares(ar);
    for(int i:ans)  System.out.print(i+" ");
    }
}
