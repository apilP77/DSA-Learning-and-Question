package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class removeodd{
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
        for (int i = n-1; i >= 0; i--) {
            if(array.get(i)%2!=0)
            {
                array.remove(i);

            }
        }
        System.out.println("After : "+array);
    }
}