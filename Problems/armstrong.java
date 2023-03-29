import java.util.Scanner;

public class armstrong
{
    static boolean isArmstrong(int n){
        int temp=n,z=n;
        int count=0,sum=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        while(z>0){
            int digits=z%10;
            sum=sum+(int)Math.pow(digits,count);
            z/=10;
        }
        if(n==sum)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(;x<=y;x++)
        {
            if(isArmstrong(x))
                System.out.println(x);
        }
    }
}
