package Array;


/*
 * Find the second largest element in the given array
 */
public class secondLargest
{
    public static void main(String[] args){
    int[] ar={9,8,9,6,9,5,8};
    int max=Integer.MIN_VALUE;
    int sL=Integer.MIN_VALUE;
    for(int i=0;i<ar.length;i++)
    {
        if(ar[i]>max){
            sL=max;
            max=ar[i];
        }
        else if(ar[i]>sL && ar[i]!=max)
           sL=ar[i];
    }
    System.out.println(sL);
    }
}
