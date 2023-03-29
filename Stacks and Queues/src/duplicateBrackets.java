
import java.util.*;

public class duplicateBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isDuplicate(s));
    }
    static boolean isDuplicate(String s){
        Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch==')'){
               if(st.peek()=='(')
                   return true;
               else {
                   while( st.peek() != '(' ){
                        st.pop();
                   }
               st.pop();
               }
           }
           else
               st.push(ch);
       }
        if(!st.isEmpty())   return false;
        return false;
    }
    //
    //
}
