package string_programs;
import java.util.Scanner;


public class digitsFirst
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="" , n="";
        for(int i=0;i<str.length();i++)
        {   char c=str.charAt(i);
          
            if(Character.isLetter(c))
                s=s+c;
            else if(Character.isDigit(c))
                n=n+c;
                     
        }
        String numFirst=n+s;
        System.out.println(numFirst);
    }}