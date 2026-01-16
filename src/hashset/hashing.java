package hashset;

import java.util.HashSet;
import java.util.Iterator;

class hashing{
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // inserting
        set.add(100);
        set.add(2);
        set.add(2);
        set.add(99);

        //search
        if(set.contains(1))
        {
            System.out.println("Exist");
        }else {
            System.out.println("Not Exist");
        }

        // delete
        set.remove(99);
        if(!set.contains(99))
        {
            System.out.println("Delelted");
        }

        // size
        System.out.println(set.size());

        // display
        System.out.println(set);

        // Iterator
        Iterator<Integer> it = set.iterator();
        System.out.println(it.next());
        System.out.println(it.hasNext());
    }
}