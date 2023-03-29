package string_programs;
import java.util.*;

//string encoding program--->piglatin
//Word beginning with vowel add WAY to last
//Word beginning with consonant -->Clear-Earclay
 
public class piglatin
{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String pl="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char u=Character.toUpperCase(c);
            if(u=='A'||u=='E'||i=='I'||u=='O'||u=='U')
            {
                if(i==0)
                    pl=s+"way";
                else
                    pl=s.substring(i)+s.substring(0,i)+"ay";
                break;
            }
        }
        System.out.print("Piglatin Word: "+pl);
    }
}
