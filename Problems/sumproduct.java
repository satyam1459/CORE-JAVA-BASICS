import java.util.Scanner;

class sumproduct{
    public static void main(String[] args){
    int n,d,sum=0,pro=1;
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter number whose sum of even and product of odd you want: ");
    n=sc.nextInt();
    while (n>0){
        d=n%10;
        if(d%2==0)
            sum=sum+d;
        else
            pro=pro*d;
        n=n/10;    }
    System.out.println("Sum of even digits: "+sum);
    System.out.println("Product of odd digits|:"+pro);
    }
}