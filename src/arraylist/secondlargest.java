package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

class secondlargest{
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

        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int current = array.get(i);

            if(current>max)
            {
                sec= max;
                max= current;
            }else if(sec<current && current<max)
            {
                sec = current;
            }
        }

        System.out.println("The Second Maxmimun Number in the List is : "+sec);


    }
}