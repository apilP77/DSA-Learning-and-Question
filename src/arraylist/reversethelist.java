package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
//Reverse the ArrayList without using Collections.reverse()
class reversethelist{
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

        System.out.println("Before: "+array);

        int i =0;
        int j = array.size()-1;

        while(i<j)
        {
            int temp = array.get(i);
            array.set(i,array.get(j));
            array.set(j,temp);
            i++;
            j--;
        }

        System.out.println("After: "+array);
    }
}