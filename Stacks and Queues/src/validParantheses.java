import java.util.*;
public class validParantheses {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();

    Stack<Character> st=new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='(' || ch=='[' || ch=='{'){
            st.push(ch);
        }
        else if(ch== ')'){
          boolean val=  handleClosing(st,'(');
          if(val==false){
              System.out.println("Not valid paranthese");
              return;
          }
        }
        else if(ch== '}'){
           boolean val= handleClosing(st,'{');
            if(val==false){
                System.out.println("Not valid paranthese");
                return;
            }
        }
        else if(ch== ']'){
           boolean val= handleClosing(st,'[');
            if(val==false){
                System.out.println("Not valid paranthese");
                return;
            }
         }
        else continue;
        }
    if(st.size()==0)
        System.out.println("Valid Parantheses");
    else
        System.out.println(false);
    }
    static boolean handleClosing(Stack<Character> st,char corrOpCh){
        if(st.size()==0){
            return false;
        }
        else if(st.peek() != corrOpCh){
            return false;
        }
        else {
            st.pop();
            return true;
        }
    }
}
