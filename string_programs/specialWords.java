package string_programs;

import java.util.Scanner;
/*A special word is that which starts and ends with the same character
 eg.--> Anna,Bob
 */
public class specialWords
{
    public static void main(String[] args){
        String s="Mom or Dad";
        String w="";
        s+=" ";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
                w+=c;
            else
                {
                    char f=w.charAt(0);
                    char l=w.charAt(w.length()-1);
                    if(Character.toUpperCase(l)==Character.toUpperCase(f))
                        System.out.println(w);
                    w="";
                }
        }
    }
}
