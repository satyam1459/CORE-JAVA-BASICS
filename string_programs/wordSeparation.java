package string_programs;
import java.util.Scanner;


public class wordSeparation
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w="";
        //add space to last of string so that we could
        //extract the last word which has not space in the end
        s+=" ";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' ')
                w+=c;
            else{
                System.out.println(w);
                w="";
            }
        }
    }
}
