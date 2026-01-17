package Hashmap;

import java.util.HashMap;
import java.util.Map;

class level2{
    public static void main(String[] args) {
        String str = "swiss";

        HashMap<Character,Integer> map = new HashMap<>();
        int len = str.length();
        for(int i =0 ; i<len ; i++)
        {
            Character key = str.charAt(i);
            if(map.containsKey(key))
            {
                int temp = map.get(key);
                temp++;
                map.put(key,temp);
            }else{
                map.put(key,1);
            }
        }
        for(Map.Entry<Character,Integer> set : map.entrySet())
        {
            if(set.getValue()==1){
                System.out.println("First non-repeating character is '"+set.getKey()+"'");
                break;
            }
        }
    }
}