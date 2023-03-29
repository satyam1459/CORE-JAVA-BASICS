import java.util.*;
public class nextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++)
            arr[i]=sc.nextInt();
        nextGreater(arr,n);
    }
    public static void nextGreater(int[] ar,int n){
        Stack<Integer> s=new Stack<>();
        //resultant array for storing all the answer values
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            //checking if the current value is greater than the value at the top of stock
            //if it is ,then we remove it from the stack
            while(!s.isEmpty() && s.peek()<=ar[i])
                s.pop();
            if(s.isEmpty()) ans[i]=-1;
            else ans[i]=s.peek();
            s.push(ar[i]);
        }
        for(int i: ans)
            System.out.print(i+" ");
    }
}
