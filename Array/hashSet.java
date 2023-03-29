package Array;
import java.util.Iterator;
import java.util.HashSet;
/**
 *Set is a structure which stores unique value
 *Hashmap is an unordered set
 */
 
public class hashSet
{
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        //Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        
        //Search-->contains
        if(set.contains(1))
            System.out.println("Contains 1");
        if(set.contains(22)==false)
            System.out.println("Does not contains 22");
        if(!set.contains(24))
            System.out.println("Does not contains 24");
        
        //REMOVE
        set.remove(1);
        if(!set.contains(1))
            System.out.println("1 is removed");
        
        //Size
        System.out.println("Size of hashSet=" +set.size());
        
        //Print all elements
        System.out.println(set);
        
        //Printing using iterator
        //Set has no index
        
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
