import java.util.*;

public class level1 {
    public static void main(String[] args) {
        //In hashmap ,order is not in our control
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India" , 135);
        hm.put("China", 200);
        hm.put("Pak", 30);
        hm.put("US", 20);
        hm.put("UK",10);
        System.out.println(hm);

        hm.put("Nigeria", 5);
        hm.put("US", 222);

        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.get("Utopia"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Utopia"));

        //Key set will get all keys

        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String key : hm.keySet()){
            Integer val=hm.get(key);
            System.out.println(key+" "+val);

            //All the above function runs in O(1);
        }

    }
}
