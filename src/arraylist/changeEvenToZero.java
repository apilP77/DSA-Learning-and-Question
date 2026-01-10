package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

//Modify the ArrayList so that all even numbers become 0
class changeEvenToZero{
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

        for (int i = 0; i < n; i++) {
            if(array.get(i)%2==0)
            {
               array.set(i,0);
            }
        }

        System.out.println("After:"+array);
    }
}