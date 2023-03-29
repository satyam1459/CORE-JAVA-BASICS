package Array;

/*
 * Array is fixed in size--> overcome by arraylist
 * can hold same datatype--> overcome by arrayList
 * ArrayList is a datastructure which has no limit (we can store any number of elements)
 * We can store any kind of elements
 */
import java.util.*;
public class listArray
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList a1=new ArrayList();
        ArrayList<Integer> a2=new ArrayList<>();         //Allows only integer type element
        ArrayList<String> list=new ArrayList<>();          //Allows only string type data
        
        //adding elements to arrayList
        list.add("Ravi");
        list.add("Raju");
        list.add("Pavan");
        list.add("Simran");
        list.add("Arvinder");
        
        //Returns the size of arrayList
        System.out.println("Size of arrayList with string datatype "+list.size());
        
        for(String x:list)
            System.out.println(x);
            
        //adding different types of elements to arraylist
        System.out.println("Number of elements in arrayList a1 before adding elements are : "+a1.size());
        a1.add("Welcome");
        a1.add(2);
        a1.add(20.55);
        a1.add('c');
        System.out.println("Number of elements in arrayList a1 after adding elements are : "+a1.size());
        System.out.println("Elements in arrayList before inserting "+a1);
        
        //inserting elements in arraylist
        a1.add(2,"training");        //2 describes after how many elements it should be inserted
        a1.add(1,1234);
        System.out.println("Number of elements in arrayList a1 after inserting elements are : "+a1.size());
        System.out.println("Elements in arrayList after inserting 2 and 1 "+a1);
        a1.add(4,1234);             //4 Describes number of elements not position
        
        //removing elements
        
        a1.remove(1);                      //After number of elements to remove
        //2 describes after no. of elements not exactly position
        System.out.println("Elements in the arrayList removing after position 2 :"+a1);
        a1.remove("Welcome");             //directly specifying the value
        a1.remove(2);
        System.out.println("Elements in the arrayList after removing values :"+a1);
        
        
        
        
    
    }
}