import java.util.Scanner;
public class largestDigit
{
    public static void main (String[] ar){
        int max,i,n;
        int a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        
        a=new int[n];
        System.out.println("Enter numbers: ");
         for(i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
         max=max_num(a,n);
         System.out.println("The largest number is "+max);
           
        }
        static int max_num(int []a, int n){
            int i;
            int m=0;
            for(i=0;i<n;i++)
            {
                if(a[i]>m)
                {
                    m=a[i];
                }
            }
            return m;
        }
}
