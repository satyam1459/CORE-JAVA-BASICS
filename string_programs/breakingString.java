package string_programs;

import java.util.Arrays;

public class breakingString
{
    public static void main(String[] args){
        String str1="Saket";
        //conversion into character Arrays
        char[] ch=str1.toCharArray();
        System.out.println("Original String was :"+ str1);
        System.out.println("Characters are: "+Arrays.toString(ch));
    }
}
