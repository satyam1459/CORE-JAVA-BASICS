package Array;


/*
 * Rotate the given array by k steps
 * N can be greater than  n as well
 * This create new memory to store elements of array
 */
public class rotateBy_k
{
    public static void main(String[] args){
       int[] a={1,2,3,4,5,6,7,8,9};
       int k=7;
       int n=a.length;
       k=k%n;
       int[] ans=new int[n];
       int j=0;
       for(int i=n-k;i<n;i++)
           ans[j++]=a[i];
           
       for(int i=0;i<n-k;i++)
           ans[j++]=a[i];
       
       for(int i=0;i<ans.length;i++)
           System.out.print(ans[i]+" ");
    }
}
