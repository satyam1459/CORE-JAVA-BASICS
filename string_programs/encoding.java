package string_programs;


/*
 Create a word encoding program which moves each letter by 2. e.g A becomes C,
 B becomes D,Y becomes A and so on
 */
public class encoding
{
 public static void main (String[] args){
     String str="Simply";
     String enc="";
     for(int i=0;i<str.length();i++){
         char c=str.charAt(i);
         if(c=='Y'|| c=='Z'||c=='y'||c=='z')
             c-=26;
        c+=2;
        enc=enc+c;
     }
     System.out.println(enc);
 }
}
