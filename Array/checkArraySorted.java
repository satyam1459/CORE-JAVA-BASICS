package Array;

import java.util.*;
/**
 *Check if the given array is Sorted or not
 *Return an array of smallest and largest element
 */
public class checkArraySorted
{
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={2,1,0};
        System.out.println(isSortedArray(a));
        System.out.println(isSortedArray(b));
        
        int[] ans=smallestAndLargest(a);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
        
    }
    static boolean isSortedArray(int[] ar){
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]>ar[i+1]) return false; 
        }
        return true;
    }
    static int[] smallestAndLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        /* int[] ans=new int[2];
         ans[0]=arr[0];
        ans[1]=arr[arr.length-1]; */
        return ans;
    }
}
