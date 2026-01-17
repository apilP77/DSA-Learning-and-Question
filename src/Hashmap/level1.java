package Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
// Count the frequency of words in a sentence
class level1{
    public static void main(String[] args) {
        String [] arr ={"Nepal","India","China","Nepal"};
        HashMap<String,Integer> map = new HashMap<>();

        for(String key : arr)
        {
            if(map.containsKey(key))
            {
                int temp =map.get(key);
                temp++;
                map.put(key,temp);
            }else{
                map.put(key,1);
            }
        }
        for (Map.Entry<String,Integer>set : map.entrySet())
        {
            System.out.println(set.getKey()+"->"+set.getValue());
        }
    }
}