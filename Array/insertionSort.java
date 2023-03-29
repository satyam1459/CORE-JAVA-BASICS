package Array;

import java.util.Scanner;
public class insertionSort
{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int n=sc.nextInt();
      
      System.out.println("Enter the elements of array: ");
      int[] a=new int[n];
      
      //Takes input of array elements
      for(int i=0;i<n;i++)  a[i]=sc.nextInt();
        
      insertionSort(a);
      printArray(a);
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static boolean isGreater(int [] arr,int j,int i){
        if(arr[j]>arr[i])
        return true;
        return false;
    }
    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i-1;j>=0;j--){
                if(isGreater(arr,j,i))
                  swap(arr,j,j+1);
                  else break;
            }
        }
    }
    static void printArray(int[] a){
        for(int x:a)
        System.out.print(x+" ");
    }
    
}