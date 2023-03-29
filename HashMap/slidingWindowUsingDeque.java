import java.util.*;

public class slidingWindowUsingDeque {
    static int[] findMaxEle(int[] arr,int n,int k){
        Queue<Integer> qu= new ArrayDeque<>();

        //Process first k (or first window ) elements of array
        int i;
        for(i=0;i<k;i++){
            //for every element , the previous smaller elements
            // are useless so remove them from queue
            while(!qu.isEmpty() && arr[i]>= arr[qu.peek()])
                qu.remove();
            qu.add(i);
        }
        int[] res=new int[n-k+1];
        int itr=0;

        //Process rest of the elements
        //i.e., from arr[k] to arr[n-1]
        for(i=k;i<n;++i){
            //The element at the front of the queue is the
            //largest element of sliding window
            res[itr++]=arr[qu.peek()];

            //Remove the elements which are out of this window
            while(!qu.isEmpty() && qu.peek() <= i-k)
                qu.remove();

            //Remove all elements which are smaller than the
            //currently being added element (remove useless element)
            while( !qu.isEmpty() && arr[i] >= arr[qu.peek()])
                qu.remove();
            qu.add(i);
        }
        res[itr]=arr[qu.peek()];
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
