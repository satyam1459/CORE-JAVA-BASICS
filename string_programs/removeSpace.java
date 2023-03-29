package string_programs;

public class removeSpace
{
    public static void main(String[] args){
        String s="Satyam Jaiswal";
        String r="";
        for(int i=0;i<s.length();i++){
            if(!Character.isWhitespace(s.charAt(i)))
                r=r+s.charAt(i);
                
        }
        System.out.println(r);
    }
}
