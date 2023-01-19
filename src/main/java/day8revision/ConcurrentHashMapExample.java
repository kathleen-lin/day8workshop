package day8revision;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public void example(){
        Map<String, Integer> laptops = new ConcurrentHashMap<String, Integer>();
        
        laptops.put("Acer", 75);
        laptops.put("Apple", 32);
        laptops.put("LG", 51);
        laptops.put("Sony", 93);

        System.out.println("Total laptops: " + laptops.size());

        //key set is a pair
        for (String key: laptops.keySet()){
            System.out.println(key + " - " + laptops.get(key));
        }

        String searchString = "Asus";
        if (laptops.containsKey(searchString)){
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>) laptops).elements();
        while(elems.hasMoreElements()){
            System.out.println(elems.nextElement());
        }

        Integer retVal = laptops.putIfAbsent("Asus", 25);
            if (retVal != null){
                System.out.println("Item found: " + retVal);
            }

        searchString = "Asus";
        if (laptops.containsKey(searchString)){
            System.out.println(searchString + " - " + laptops.get(searchString));

        }
         }


    
}
