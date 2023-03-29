import java.util.*;

public class infixEval {
    public static void main(String[] args) {
        String s = "2+(5-3*6/2)";
        Stack<Integer> opnds=new Stack<>();
        Stack<Character> optors=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c =='(')  optors.push(c);
            else if( Character.isDigit(c) )         opnds.push(c-'0');
            else if(c == ')'){
                while(optors.peek() != '('){
                    char opt=optors.pop();
                    int v2=opnds.pop();
                    int v1=opnds.pop();
                    int val=operation(v1,v2,opt);
                    opnds.push(val);
                }
                optors.pop();
            }
            else if(c=='+' || c=='-' || c=='*' || c=='/'){
                while(optors.size() > 0 && optors.peek() != '(' && precedence(c) <= precedence(optors.peek())){
                    char opt=optors.pop();
                    int v2=opnds.pop();
                    int v1=opnds.pop();
                    int val=operation(v1,v2,opt);
                    opnds.push(val);
                }
                optors.push(c);
            }
        }
        while(!optors.isEmpty()){
            char opt=optors.pop();
            int v2=opnds.pop();
            int v1=opnds.pop();
            int val=operation(v1,v2,opt);
            opnds.push(val);
        }
        System.out.println(opnds.pop());
    }
    static int precedence(char ch){
        if(ch=='+' || ch=='-')  return 1;
        else
            return 2;
    }
    static int operation(int v1,int v2,char op){
        if(op=='+') return v1+v2;
        else if(op=='-')    return v1-v2;
        else if(op=='*')    return v1*v2;
        else   return v1/v2;
    }
}
