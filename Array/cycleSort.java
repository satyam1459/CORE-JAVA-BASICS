package Array;

import java.util.Scanner;
/**
 *Cycle sort is a sorting technique which implements in time complexity of O(n).
 *The condition is that give number is in range from 1 to n where n is size of array
 */
public class cycleSort
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)    ar[i]=sc.nextInt();
        
        int i=0;
        while(i<n){
            int correctIdx=ar[i]-1;
        if(ar[i]!=ar[correctIdx])
           swap(ar,i,correctIdx);
        else
            i++;
        }
        for(int x:ar)   System.out.print(x+" ");
    }
    static void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}
