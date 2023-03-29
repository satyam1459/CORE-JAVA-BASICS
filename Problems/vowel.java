import java.util.Scanner;
class vowel{
    public static void main(String[] args){
        char ch;
        System.out.println("Enter any character: ");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("Vowel");
        else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
             System.out.println("Consonant");
        else
            System.out.println("Not an alphabet");
        
           
    }
}