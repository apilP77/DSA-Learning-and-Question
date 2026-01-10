package arraylist;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class frequencycount{
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
        for (int i = 0; i < array.size(); i++) {
            boolean already = false;
            for (int j = 0; j < i; j++) {

                if (array.get(i).equals(array.get(j))) {
                    already = true;
                    break;
                }
            }
            if(already) {
                    continue;
                }
            int count=0;
            for(int j =0;j<array.size();j++)
            {
                if(array.get(i).equals(array.get(j)))
                {
                    count++;
                }
            }
            System.out.println(array.get(i)+"->"+count);
        }

    }
}