import java.util.Scanner;
class revmultiple{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=n/8;
        System.out.println(i);
        for(;i>=1;i--){
            System.out.print((8*i)+" ");
        }
        
    }
}
