import java.util.Scanner;
public class rotateDigits
{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      int k=sc.nextInt();
      
      int temp=n;
      int digits=0;
      while(temp>0){
          temp/=10;
          digits++;
      }
      k=k%digits;
      if(k<0)
      k=k+digits;
      
      int div=1;
      int mul=1;
      for(int i=1;i<=digits;i++){
      if(i<=k){
          div*=10;
      }
      else{
          mul*=10;
      }
    }
    
    int q=n/div;
    int r=n%div;
    
    int rot=r*mul+q;
    System.out.println(rot);
    
    
    }
}
