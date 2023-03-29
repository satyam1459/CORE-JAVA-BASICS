import java.util.*;

//Infix conversion --> postfix and prefix
//Postfix--> operands comes first then operators;
//Prefix--> operators comes first then opera
public class infixConversion {
    public static void process(Stack<String> pre, Stack<String> post, Stack<Character> optor){
        char op=optor.pop();
        String v2=pre.pop();
        String v1=pre.pop();
        String val=op+v1+v2;
        pre.push(val);

        String pv2=post.pop();
        String pv1=post.pop();
        String pVal=pv1+pv2+op;
        post.push(pVal);
    }
    static int precedence(char ch){
        if(ch=='+' || ch=='-')  return 1;
        else if(ch=='/' || ch=='*') return 2;
        else return 0;
    }
    public static void main(String[] args) {
        String exp="a*(b-c*d)/e+f";
        Stack<String> pre=new Stack<>();
        Stack<String> post=new Stack<>();
        Stack<Character> optor=new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch == '(')   optor.push(ch);
            else if((ch >= '0' && ch <= '9') || (ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) {
                pre.push(ch+"");
                post.push(ch+"");
            }
            else if(ch == ')'){
                while(optor.peek() != '(')
                    process(pre,post,optor);
                optor.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while (optor.size() > 0 && optor.peek()!='(' && precedence(ch) <= precedence(optor.peek())){
                 process(pre,post,optor);
                }
                optor.push(ch);
            }
        }
        while(optor.size()>0){
            process(pre,post,optor);
        }
        System.out.println(pre.pop());
        System.out.println(post.pop());

    }
}
