package hashset;

import java.util.HashSet;

class level3{
    public static void main(String[] args) {

        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        int[] num ={1,2,3,4,5,2,3,7,6,8,8};

        for(int nums:num)
        {
            if(!unique.add(nums))
            {
                dup.add(nums);
            }
        }
        System.out.println("Unique: " + unique);
        System.out.println("Not Unique "+ dup);
    }
}