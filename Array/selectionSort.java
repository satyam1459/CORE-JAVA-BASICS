
package Array;
import java.util.Scanner;

/*
 * selection sort is a combination of searching and sorting
 * it sorts an array by repeatedly finding the minimum element 
 * (considering ascending order )from unsorted part and puting it into beginning 
 * in every iteration of selection sort the min element is picked from the unsorted array and move to the sorted subarry 
 */
public class selectionSort
{

    static int[] selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            
        }
        return arr;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=selectionSort(arr);
        printArray(ans);
}}
