package arraydequeue;

import java.util.ArrayDeque;
import java.util.Scanner;

class removeNegative{
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

        System.out.println("Enter the K For the first negtive Number");
        int k = sc.nextInt();

        while (k!=0)
        {
            int temp = array.removeFirst();
            if(temp<0)
            {
                System.out.print(temp+" ");
                k--;
            }
            if(array.isEmpty())
                break;
        }
    }
}