import java.util.*;

public class slidingWindowUsingPQ {
    static int[] findMaxEle(int[] arr, int n, int k){

        //Creating the max heap to get the maximum element
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int[] res = new int[n-k+1];
        int itr=0;

        for(int i=0; i < k;i++)
            pq.add(arr[i]);

        //adding the maximum element among first k elements
        res[itr++]= pq.peek();

        //removing the first element of the array
        pq.remove(arr[0]);

        //iterating for the next elements
        for(int i=k; i<n;i++){
            //adding the new element in window
            pq.add(arr[i]);

            //finding & adding the max element in the current sliding window
            res[itr++]=pq.peek();

            //finally removing the first element from
            // end of queue
            pq.remove(arr[i-k+1]);
        }
    return res;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)    ar[i]=sc.nextInt();
        int k=sc.nextInt();
        int[] res=findMaxEle(ar,n,k);
        for(int x: res) System.out.print(x+" ");
    }
}
