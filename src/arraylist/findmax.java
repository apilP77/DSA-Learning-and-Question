package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

class findmax{
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

        int max = array.get(0);
        for (int i = 1; i < n; i++) {
            if(max<array.get(i))
            {
                max=array.get(i);
            }
        }
        System.out.println("The Maxmimun Number in the List is : "+max);

        }
}