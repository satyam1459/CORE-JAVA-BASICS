package Array;


import java.util.Scanner;
public class stringBubbleSort
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //String[] arr={"Rahul","Amit","Deepak","Vironika","Ram"};
        String[] arr=new String[8];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextLine();
            
            String temp;
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0){
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                 flag=1;
                }
            }
            if(flag==0)
                break;
        }
        for(String s:arr)
            System.out.print(s+" ");
    }
}
