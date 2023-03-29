import java.util.Scanner;
/**
 * Write a description of class char_lower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class char_lower
{
    public static void main(String[] args){
        char ch1,ch2;
        System.out.println("Enter an character ");
        Scanner sc=new Scanner(System.in); 
        ch1=sc.next().charAt(0);
        if (ch1 >='A' && ch1<='Z')
        {
            ch2=Character.toLowerCase(ch1);
            System.out.println(ch2);
        }
        else if (ch1>='a' && ch1<='z')
        {
            ch2=Character.toUpperCase(ch1);
            System.out.println(ch2);
        }
    }
}
