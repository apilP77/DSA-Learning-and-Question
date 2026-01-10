package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class shiftone{
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter the Total number of Element ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("The "+(i+1)+"th Number");
            int temp = sc.nextInt();
            array.add(temp);
        }

        System.out.println("Before:"+array);

        int firstitem=array.get(0);
        for (int i = 0; i <array.size()-1 ; i++) {
            array.set(i,array.get(i+1));

        }
        array.set(array.size()-1,firstitem );
        System.out.println("After:"+array);
    }
}