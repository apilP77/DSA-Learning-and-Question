package arraydequeue;

import java.util.ArrayDeque;

class arraydequeuebasic{
    public static void main(String[] args) {
        ArrayDeque<Integer> array = new ArrayDeque<>();

        array.add(10);
        array.add(20);
        System.out.println(array);

        array.remove(20);
        System.out.println(array);

        array.addFirst(100);
        System.out.println(array);

        System.out.println();
    }
}