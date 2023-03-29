
/*String literal and string object having same string have not same memory,
 * they are not equal
 * (y.equals(z))--> It will check the actual value not refrences
 * (y==z)---> This will check refrences
 */
public class stringComparison
{
    public static void main (String[] args){
        String x="Hello";                      //string literal
        String y="hello";                      //string literal
        String z=new String("hello");          //string object
        System.out.println("Value of z is"+z);
        
        if(x=="Hello")
            System.out.println("x is equal to hello");
        else
            System.out.println("x is not equal to hello");
            
        if(x==y)
            System.out.println("x is equal to y");
        else
            System.out.println("x is not equal to y");
            
        if(y==z)
            System.out.println("y is equal to z");
        else
            System.out.println("y is not equal to z");
            
        if(y.equals(z))
            System.out.println("y is equal to z");
        else
            System.out.println("y is not equal to z");
            
            
        //(y.equalIgnoreCase(z))
        //This will ignore the case and check the actual value
        
        if(x.equalsIgnoreCase(z))
            System.out.println("x is equal to z");
        else
            System.out.println("x is not equal to z");
        
        
    }
   
}
