package Array;


/*
 * Rotate the given array by k steps ,where k is non-negative without using extra space
 */
public class rotateInPlace
{
    public static void main(String[] args){
       int[] a={1,2,3,4,5,6,7,8,9};
       rotateInPlace(a,7);
       
    }
    static void reverse(int[] ar,int i,int j){
        while(i<j)
        {
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateInPlace(int[]ar,int k){
        int n=ar.length;
       k=k%n;
       reverse(ar,0,n-k-1);
       reverse(ar,n-k,n-1);
       reverse(ar,0,n-1);
       
       for(int i=0;i<ar.length;i++)
           System.out.print(ar[i]+" ");
       System.out.println();
    }
}
