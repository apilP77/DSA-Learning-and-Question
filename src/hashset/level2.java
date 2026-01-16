package hashset;

import java.util.HashSet;

class level2{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,1};
        int[] arr2={2,5,1,4};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr)
        {
            set.add(num);
        }

        for(int nums : arr2)
        {
            if(set.contains(nums))
            {
                System.out.print(nums+"->");
            }
        }
    }
}