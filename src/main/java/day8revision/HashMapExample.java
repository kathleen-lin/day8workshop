package day8revision;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public void example() {
        Map<String, Integer> phones = new HashMap<>();

        phones.put("iphone", 10);
        phones.put("Hwawei", 2);
        phones.put("Samsung", 8);
        phones.put("XiaoMi", 5);

        System.out.println("Total phone types: " + phones.size());
        
        for (String key: phones.keySet()){
            System.out.println(key + " - " + phones.get(key));
        }

    
        String searchString = "";
        Console cons = System.console();

        while (!searchString.equals("quit")){
            searchString = cons.readLine("Enter phone to search: ");

            if (phones.containsKey(searchString)){
                System.out.println(searchString + " - " + phones.get(searchString));

            } 
            else if (searchString.equals("quit")){
                break;
            }
            else {
                System.out.println("Phone not found");
            }
        }

        phones.clear();

        System.out.println("Total phones: "+ phones.size());
        
    }
}
