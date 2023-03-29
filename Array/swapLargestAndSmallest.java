package Array;


import java.util.Scanner;
class swapLargestAndSmallest{
    static int maxIdx(int[] a){
        int maxIdx=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>a[maxIdx]){
                maxIdx=i;
            }
        }
        return maxIdx;
    }
    static int minIdx(int[] a){
        int minIdx=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<a[minIdx]){
                minIdx=i;
            }
        }
        return minIdx;
    }
    static void swapMaxAndMin(int[] a){
        int maxIdx=maxIdx(a);
        int minIdx=minIdx(a);
        int temp=a[maxIdx];
        a[maxIdx]=a[minIdx];
        a[minIdx]=temp;
        for(int i=0;i<a.length;i++) 
        System.out.print(a[i]+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of elements : ");
        int n=sc.nextInt();
       
        int[] ar=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)    ar[i]=sc.nextInt();
        
         swapMaxAndMin(ar);
    }
}
