import java.util.*;
public class basicCalculator772  {
    public static int value(String s){
        int sum=0;
        int sign= 1;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                int val=0;
                //handle number having more than one digit
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                val=val*sign;
                sign=+1;
                sum+=val;
            }
            else if(ch=='('){
                st.push(sum);
                st.push(sign);
                sum=0;
                sign=+1;
            }
            else if(ch==')' && !st.isEmpty()){
                sum*=st.pop();
                sum+=st.pop();
            }
            else if(ch=='-'){
                sign*=-1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.next();
        System.out.println(value(exp));
    }
}
