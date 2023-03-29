package Array;


/**
 *Reverse an array consisting of int value
 *There are 3 approach
 */


public class reverseArray
{
    //Creating new memory
   static int[] reverseAr(int[] ar){
       int n=ar.length;
       int[] ans=new int[n];
       int j=0;
       for(int i=n-1;i>=0;i--)
           ans[j++]=ar[i];
       return ans;
   }
   //Using while loop
   static int[] reverse(int[] ar){
       int n=ar.length;
       int[] ans=new int[n];
       int j=0,i=n-1;
       while(i>=0)
       { 
         ans[j++]=ar[i--];  
       }
       return ans;
   }
   //In Place reversing
   static void swap(int[] a,int i,int j){
       int temp=a[i];
       a[i]=a[j];
       a[j]=temp;
   }
   static void inPlaceReverse(int[] ar){
       int i=0; int j=ar.length-1;
       while(i<j){
           swap(ar,i,j);
           i++; j--;
        }
   }
   public static void main(String[] args){
       int[] a={1,2,3,4,5,6,7,8,9};
       
       //int[] ans=reverse(a);
       inPlaceReverse(a);
       for(int i=0;i<a.length;i++)
           System.out.print(a[i]+" ");
   }
}
