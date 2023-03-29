package Array;
/*In shallow copy the two arrays are of two different reference variable
 * but addresses to same memory address
 * that's why it is said to be 'shallow copying'
 */

import java.util.Scanner;

public class arrayReferenceShallowCopying{
    static void printArray(int[] ar){
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    System.out.println("Enter the "+n+ " elements of array");
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++)       arr[i]=sc.nextInt();
    
    System.out.println("Original Array");
    printArray(arr);
    //trying to copy arr to arr_1
    
    int[] arr_1=arr;
    //Changing some values of arr_1
    
    arr_1[0]=1000;                     //This will cause change in original array too as elements of array are stored in heap memory
    arr_1[1]=9992;                     //and refernce in array don't create new memory class in heap only new memory address is created
    System.out.println("Change array ");
    printArray(arr_1);
    System.out.println("Original array after change ");
    printArray(arr);
    }
}
