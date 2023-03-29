package Array;

import java.util.*;
/* Non-Generic
 * not specific to datatype
 * Dynamic array
 * add remove
 * use the methods present in the list interface
 */


public class arrayList
{
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(10);
        list.add("Java");
        list.add(true);
        list.add(null);
        list.add('c');
        list.add(56.59);
       for(var l:list)
            System.out.println("Non-Generic:" +l);
        System.out.println("size of arrayList = "+list.size());
       
        //empty arraylist-->       
        ArrayList list1=new ArrayList();
        System.out.println("Size of list1 = "+list1.size());
        System.out.println("Checking the arraylist :"+list1.isEmpty()); 
       
       //to remove a record
       //You can remove by index only
       list.remove(1);
       for(var x:list)
           System.out.println("After removing:"+x);
        
       //Access a value
       //You can access by index only
       System.out.println(list.get(1));
       
       
       //update the elements
       list.set(2,"Apple");
       for(var l:list)
           System.out.println(l);
        
    }
}
