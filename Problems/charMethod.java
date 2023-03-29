import java.util.Scanner;

public class charMethod
{ public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an charater");
        char ch=sc.next().charAt(0);
        boolean result1=Character.isLetter(ch);
        System.out.println(result1);
        
        boolean result2=Character.isDigit(ch);
        System.out.println(result2);

        boolean result3=Character.isWhitespace(ch);
        System.out.println(result3);

        boolean result4=Character.isLowerCase(ch);
        System.out.println(result4);
        
        boolean result5=Character.isUpperCase(ch);
        System.out.println(result5);
        
        char ch2=Character.toUpperCase(ch);
        System.out.println(ch2);
        
        String s=Character.toString(ch);
        System.out.println(s);
        
}
}

