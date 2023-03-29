package Array;
// generic -->specific to datatype
import java.util.*;
public class genericArrayList
{
   public static void main(String[] args)
   {
       ArrayList<Integer> intlist=new ArrayList<Integer>();
       intlist.add(90);
       intlist.add(798);
       intlist.add(786);
       intlist.add(785);
       
       for(int i:intlist)
           System.out.println(i);
       
           //sorting in ascending order
       System.out.println("Ascending order");
        Collections.sort(intlist);
       for(int i:intlist)
          System.out.println(i);
            
       
       //Descending order sorting
       //first we have to made it in ascending order ,
       //then we use below method to make it in descending order
       
       System.out.println("Descending order");
       Collections.reverse(intlist);
       for(int i:intlist)
           System.out.println(i);
   }
}
