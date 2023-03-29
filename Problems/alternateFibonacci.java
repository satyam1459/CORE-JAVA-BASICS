import java.util.Scanner;
class alternateFibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1=0,t2=1,t3=0,term=1;
        while(term<=n){
            if(term%2!=0)
                System.out.print(t3+" ");
            t1=t2;
            t2=t3;
            t3=t1+t2;
            term++;
        }
        
    }
}