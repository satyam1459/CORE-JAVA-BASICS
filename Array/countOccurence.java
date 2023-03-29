package Array;


/**
 *Count the number of occurence of a particular element x
 *Count the last occurence index of a particular element x
 */
public class countOccurence
{
    public static void main(String[] args){
    int[] arr={5,3,6,6,7,5,6};
    int x=6;
    System.out.println("Number of occurence of "+x+" = "+countOccurence(arr,x));
    System.out.println("Last index of "+x+" is "+lastOccurence(arr,x));

    }
    
    static int countOccurence(int[] ar,int x){
        int count=0;
        for(int i=0;i<ar.length;i++)
            {
                if(ar[i]==x)    count++;
            }
        return count;
    }
    
    static int lastOccurence(int[] arr,int x){
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)   index=i;
        }
        return index;
    }
}
