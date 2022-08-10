package leet;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }


    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            } else {
                hashSet.add(num);
            }
        }
        return false;
    }
}
