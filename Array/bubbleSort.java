package Array;

import java.util.Scanner;

public class bubbleSort
{
    static void swap(int[] ar,int a,int b){
        int temp=ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
    }
    static int[] bubbleSort(int[] arr){
        
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            //boolean swapped will track swapping
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++)
              {
                  if(arr[j]>arr[j+1]){
                      swap(arr,j,j+1);
                      swapped=true;
                    }
              }
              if(swapped==false)
            break;
        }
        return arr;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int[] ans=bubbleSort(arr);
        
        printArray(ans);
    }
}
