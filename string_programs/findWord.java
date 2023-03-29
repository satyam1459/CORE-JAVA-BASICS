package string_programs;
import java.util.Scanner;

/*Find a word exist in a String.
 */
public class findWord
{   public static void main(String[] args){
    System.out.println("Enter string: ");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String w=""; str+=" "; int count=0;
    for(int i=0;i<str.length();i++)
    { char c=str.charAt(0);
        if (c!=' ')
         w+=c;
        else
         {
             if(w.equalsIgnoreCase("OK"))
                 {count++;
                    }
              w="";   
         }
    }
    if(count==1)
        System.out.println("Found");
    else
        System.out.println("Not Found");
    }
}
