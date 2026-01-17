package Hashmap;
import java.util.*;
class basichashmap{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // intersetion
        map.put("Nepal",1);
        map.put("India", 2);

        //display
        System.out.println(map);

        // search
        if(map.containsKey("America"))
        {
            System.out.println("Present in the map");
        }else{
            System.out.println("Not present");
        }
        System.out.println(map.get("India"));

        //iterate
        for(Map.Entry<String,Integer> helo: map.entrySet())
        {
            System.out.println(helo.getKey());
            System.out.println(helo.getValue());
        }
        // remove
        map.remove("India");
        System.out.println(map);
    }
}