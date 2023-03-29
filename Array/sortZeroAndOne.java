package Array;

import java.util.*;
public class sortZeroAndOne
{
    static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] ar=new int[n];
    for(int i=0;i<n;i++)    ar[i]=sc.nextInt();
    
    int left=0; int right=n-1;
    while(left<right){
        if(ar[left]==1 && ar[right]==0){
            swap(ar,left,right);
            left++; right--;
        }
        else if(ar[left]==0) left++;
        else   right--;
    }
    for(int i:ar)   System.out.print(i+" ");
    System.out.println();
    }
}
