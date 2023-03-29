import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
/*In this lesson,you will learn --->
i)--> Basic Map(Hash Map) functionality
    a) Constructors
    b) Methods:
        i)--> Put family : put() , putIfAbsent()
        ii)--> Get family : get(), get or default()
        ii)--> Compute family : compute()
                              : computeIfPresent()
                              : computeIfAbsent()
        iv)--> Other Methods : replace()
                             : remove()
                             : containsKey()
                             : keySet()
    c)--> Iterate map using 3 methods
        i)--> Iterating through key set
        ii)--> Using the iterator
        ii)--> Using the forEach Method()
 */
public class hashMapRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create a new HashMap (Mapping Dessert--> Count: String -> Integer : Key --> Value)

        Map< String , Integer> mDessertCount1 = new HashMap<>();             //Basic Way
//        Map< String , Integer> mDessertCount2 = new HashMap<>(4);    //Initial capacity
//        Map< String , Integer> mDessertCount3 = new HashMap<>(4,0.5f);   //Initial Capacity, Load Factor
//        Map< String , Integer> mDessertCount4 = new HashMap<>(mDessertCount3);                //Existing Map to copy

        //Repeatedly prompt user
        boolean moreDesserts = true;
        do{
            //Prompt user for more dessert
            System.out.println("Please enter your favourite dessert : ");
            String dessert=sc.nextLine().toUpperCase();

            //Update dessert countMap (Method 1-->Using put/get/replace)
            if (!mDessertCount1.containsKey(dessert)){
                mDessertCount1.put(dessert, 1);
            }
            else{
                //key already exists
                int updatedCount = mDessertCount1.get(dessert)+1;
                mDessertCount1.put(dessert,updatedCount);
                //mDessertCount1.replace(dessert,updatedCount);
            }
            System.out.println("More Desserts (Enter 'Y' or 'N')");
            moreDesserts = sc.nextLine().toUpperCase().charAt(0) == 'Y';
        }while(moreDesserts);
        //Print out all desserts with frequency (Iterate using KeySet());
        System.out.print("\nAll Dessert : ");
        for(String dessert : mDessertCount1.keySet())
            System.out.printf("\t %s was chosen as a favourite dessert %s time(s) \n", dessert,mDessertCount1.get(dessert));
    }
}
