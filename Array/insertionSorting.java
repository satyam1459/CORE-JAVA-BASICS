package Array;

import java.util.Scanner;
public class insertionSorting
{
    public static void main(String[] args){
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the elements of array :");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
            int temp,j;
        for(int i=1;i<a.length;i++){
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for(int x:a)
            System.out.print(x+",");
    }
}
