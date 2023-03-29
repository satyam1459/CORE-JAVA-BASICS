import java.util.Scanner;
class charArray{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        char[] charArray= new char[10];
        System.out.println("Enter characters :");
        for(int i=0;i<10; i++){
            charArray[i]=sc.next().charAt(0);
        
    }
    String str=new String(charArray);
    System.out.println(str);
}
}