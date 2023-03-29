import java.util.*;
public class nxtGrtrEle {
    public static void main(String[] args) {
        int[] arr={2,8,8,8,8,8,8,23};
        //In this approach we should start from the beginning
        Stack<Integer> st=new Stack<>();
        //we should push the first index of arr ,which help in comparison
        st.push(0);
        int[] nge=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            while( !st.isEmpty() && arr[i] > arr[st.peek()]){
                nge[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        //the remaining index which didn't find their next greater element in array should be changed to -1
        while( ! st.isEmpty()){
            nge[st.pop()]=-1;
        }
       for(int i:nge)   System.out.print(i+" ");
    }
}
