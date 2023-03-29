import java.util.*;
public class postfix {
    static int operation(int v1 , int v2, char ch){
        if(ch=='+') return v1+v2;
        else if(ch=='-')    return v1-v2;
        else if(ch=='*')    return v1*v2;
        else if(ch=='/')    return v1/v2;
        return -1;
    }
    public static void main(String[] args) {
        //Postfix conversion in value stack , infix stack and prefix stack
        String exp = "264*8/+3-";           //postfix expression
        Stack<Integer> vs=new Stack<>();    //value stack
        Stack<String> is=new Stack<>();     //infix stack
        Stack<String> ps=new Stack<>();     //prefix stack

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v2 = vs.pop();
                int v1 = vs.pop();
                int val = operation(v1,v2,ch);
                vs.push(val);

                String iv2=is.pop();
                String iv1=is.pop();
                String iVal="("+iv1+ch+iv2+")";
                is.push(iVal);

                String pv2=ps.pop();
                String pv1=ps.pop();
                String pVal=ch+pv1+pv2;
                ps.push(pVal);
            }
            else {
                vs.push(ch-'0');
                is.push(ch+"");
                ps.push(ch+"");
            }
        }
        System.out.print(vs.pop());
        System.out.println();
        System.out.print(is.pop());
        System.out.println();
        System.out.print(ps.pop());
    }
}
