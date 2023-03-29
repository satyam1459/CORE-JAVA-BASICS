package Array;


/**
 *IN CASE OF ARRAY 
 *ACTUAL VALUE NEVER PASS ONLY CHANGE VALUE PASS
 */
public class changeArrayPassByValue
{
   public static void main(String[] args){
       int[] arr=new int[3];
       arr[0]=5;
       arr[1]=6;
       arr[2]=7;
       change_Array(arr);
   }
   static void change_Array(int[]arr){
       for(int i=0;i<arr.length;i++)
           arr[i]=0;
    
       for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");
   }
}
