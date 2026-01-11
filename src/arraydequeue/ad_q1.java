package arraydequeue;

import java.util.ArrayDeque;
import java.util.Scanner;

// Reverse First K Elements of a Queue
class ad_q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> array= new ArrayDeque<>();

        System.out.println("Enter the total number of element");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+(i+1)+"th Number");
            array.add(sc.nextInt());
        }
        System.out.println("Before: "+array);

        System.out.println("Enter the Number you want to reserve ");
        int k = sc.nextInt();
        reverse(array,k);
    }
    public static void reverse (ArrayDeque<Integer> q , int k)
    {
        if(k<0 || k>q.size())
            return;

        ArrayDeque<Integer> arr =new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            arr.push(q.removeFirst());
        }
        System.out.println(arr);

        for(int i =0; i<=q.size();i++)
        {
            arr.addLast(q.removeFirst());
        }
        System.out.println(arr);
    }
}