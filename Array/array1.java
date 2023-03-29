package Array;
/*arraylist class is an resizeable array, which can be found in java.util package
 * While elements can be added and removed from an arraylist whenever you wanrt
 * arraylist can have ,duplicate element also
 * It maintains the insertion order internally
 */
import java.util.*;
public class array1
{
    public static void main(String[] args){
    int[] arr={12,33,44,2,8};
     for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");
    System.out.println();
    //for each loop
    //for each(type var:array)
    for(int x:arr)
        System.out.print(x+",");
    System.out.println();        
    char[] ch=new char[6];
    ch[0]='P';
    ch[1]='y';
    ch[2]='t';
    ch[3]='h';
    ch[4]='o';
    ch[5]='n';
    
    for(char c:ch)
        System.out.print(c+" ");
    System.out.println();
    
    //Accessing based on index
    System.out.println("Accessing based on index= "+ch[2]);
    
    //String array
    String[] str={"Java","Python","C#","Javascript"};
    for(String s:str)
        System.out.println(s);
    
    //Converting string to charArray
    String str1="Python";
    char[] ch1=str1.toCharArray();
    for(char x:ch1)
        System.out.print(x+",");
    
    System.out.println();   
    
    //Sorting array
    int[] arr1={7,8,3,1,10};
    Arrays.sort(arr1);
    for(int y:arr1)
        System.out.print(y+" < ");
    System.out.println();
    System.out.println("Sorting with array:"+Arrays.toString(arr1));
    
    }  
}
