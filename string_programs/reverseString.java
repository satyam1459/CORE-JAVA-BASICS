package string_programs;


public class reverseString
{
   public static void main(String[] args){
       String str="maytas";
     /*  String rev="";
       for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           rev=c+rev;
       }
       System.out.println(rev);*/
       String rev="";
       for(int i=str.length()-1;i>=0;i--){
           char c=str.charAt(i);
           rev=rev+c;
       }
       System.out.println(rev);
   }
}
