package Array;
/*
 * Find the unique number in a given array where all the elements 
 * are being repeated twice with one value being unique
 */
public class uniqueElements
{
    static int findUnique(int[] ar){
        int n=ar.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]==ar[j])
                    {
                        ar[i]=-1;
                        ar[j]=-1;
                    }
            }
        }
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(ar[i]>0)
                ans=ar[i];
        }
        return ans;
    }
    public static void main(String[] args){
        int[] ar={1,2,3,4,2,1,3};
        System.out.println(findUnique(ar));
    }
}
