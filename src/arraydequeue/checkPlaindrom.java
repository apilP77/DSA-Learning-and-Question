package arraydequeue;

import java.util.ArrayDeque;
import java.util.Scanner;

class checkPlaindrom{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayDeque<Integer> array= new ArrayDeque<>();

    System.out.println("Enter the total number of element");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.println("Enter the "+(i+1)+"th Number");
        array.add(sc.nextInt());
    }
    System.out.println(array);

    int size=array.size();
    int len = size/2;
    boolean plaindrom=true;

    for (int i = 0; i <len ; i++) {
        if(!array.removeLast().equals(array.removeFirst()))
        {
            plaindrom=false;
            System.out.println("Not Plaindrome");
            break;
        }
    }
    if(plaindrom)
    {
        System.out.println("Plaindrome");
    }


}
}
