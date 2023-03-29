package string_programs;
import java.util.Scanner;


public class charSeparation
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
                //Print first character of string
                System.out.println(w.charAt(0));
                //Print first two character of string
                System.out.println(w.substring(0,2));
                //Print only character that starts with R
                if(w.startsWith("R"))
                    System.out.println(w);
                //print words containing E in a sentence
                if(w.contains("E"))
                    System.out.println(w);
                //print words with 3 character
                if(w.length()==3)
                    System.out.println("Words with 3 character= "+w);
                    
                w="";
            }
        }
    }
}
