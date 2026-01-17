package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class level3{
    public static void main(String[] args) {

        String[] str ={"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : str)
        {
            char [] chars =word.toCharArray();
            Arrays.sort(chars);
            String sortedword=new String(chars);

            map.computeIfAbsent(sortedword,k-> new ArrayList<>()).add(word);
        }

        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);
    }
}