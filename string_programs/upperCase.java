package string_programs;
import java.util.*;

public class upperCase
{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                str1=str1+str.charAt(i);    
                    
        }
        System.out.print("Short Form is-"+str1);
           System.out.println();
        // lower case print
         for(int i=0;i<str.length();i++){
         
            if(Character.isLowerCase(str.charAt(i))){
                System.out.println("LowerCase are- "+str.charAt(i));
            }
        }
        
        // Letter Print with Space
        String str2="";
        for(int i=0;i<str.length();i++){
         
            if(Character.isLetter(str.charAt(i)))
                str2=str2+str.charAt(i);
            else if (Character.isWhitespace(str.charAt(i)))
                 str2=str2+" ";
            
        }System.out.println("String without numbers- "+str2);
        
        //Digits print
        String str3="";
        for(int i=0;i<str.length();i++){
         
            if(Character.isDigit(str.charAt(i))){
                str3=str3+str.charAt(i);
            }
            
        }
        System.out.println("digits are- "+str3);
    }
}
