package arraylist;
import java.util.ArrayList;
import java.util.Comparator;

class arraylistbasic{
    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>();

        first.add(89);
        //System.out.println(first);

        first.add(88);
        first.add(90);


        first.add(0,19);
        System.out.println(first);

        first.remove(3);
        System.out.println(first);

        System.out.println(first.get(2));
        first.sort(Comparator.naturalOrder());
        System.out.println(first);
        System.out.println(first.contains(1));
        System.out.println(first.isEmpty());
        System.out.println("Values:");
        for(Integer value : first)
        {
            System.out.print(value+ " ");
        }
    }
}
