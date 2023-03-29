package string_programs;



public class aBcD
{
    public static void main(String[] args){
        char ch1='a';
        char ch2='B';
        for(int i=1;i<=26;i++){
            if(i%2!=0)
            {
                System.out.print(ch1+" ");
                ch1+=2;
            }
            else
            {
                System.out.print(ch2+" ");
                ch2+=2;
            }
        }
    }
}
