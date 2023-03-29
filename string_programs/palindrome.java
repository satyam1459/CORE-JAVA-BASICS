package string_programs;

import java.util.*;

public class palindrome
{   public static void main(String[] ar){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String rev="";
    for(int i=0;i<s.length();i++){
        rev=s.charAt(i)+rev;
    }
    if(s.equalsIgnoreCase(rev))
        System.out.println("Palindrome");
    else
       System.out.println("Not Palindrome");
    }
}