package Array;


import java.util.*;

public class cloningArrayDeepCopy
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] ar=new int[n];
    for(int i=0;i<n;i++)    ar[i]=sc.nextInt();
    
    //Cloning an Array
    //Arrays.copyOf(array whose copy is to made, length)
    //This will assign new memory address to arr_2
    int[] arr_2=Arrays.copyOf(ar,ar.length);
    
    //2nd method to clone Array
    //This will also create a new memory address
    //Arrays,copyOfRange(array whose copy, inclusive start,exclusive end);
    /*These array in range index starts from 0 ,
      no matter from which range it takes elements. */
    int[] arr_3=Arrays.copyOfRange(ar,1,4);
    //Change in copied array withing rannge elements
    arr_3[2]=3;
    
    
    //Change in ar_2 will cause change in array in, if there is no clone method
    arr_2[0]=1;
    arr_2[1]=2;
    System.out.println("Original Array");
    printArray(ar);
    
    System.out.println("Copied Array with new memory address");
    printArray(arr_2);
    
    System.out.println("Copied Array with range provided");
    printArray(arr_3);
    
    
    }
    
    //Function to printArray
    static void printArray(int[] ar){
        int n=ar.length;
        
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
        
        System.out.println();
    }
}
