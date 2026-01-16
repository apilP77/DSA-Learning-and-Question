package hashset;

import java.util.HashSet;

class level1
{
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,1};
        HashSet<Integer> set = new HashSet<>();
        for(int num:array)
        {
            set.add(num);
        }
        System.out.println("Unique element:" +  set);
        System.out.println("Count of unique element "+set.size());
    }
}