package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
// Check if a given number exists in the ArrayList.
class ifexist {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("The "+(i+1)+"th Number");
            int temp = sc.nextInt();
            array.add(temp);
        }

        System.out.println("Enter the Number you wanna see if exist");
        int search = sc.nextInt();

        if(array.contains(search))
        {
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
    }
}