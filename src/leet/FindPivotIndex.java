package leet;

import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        // P[P.length - 1] - P[i] - nums[i].
        // We can precompute prefix sums P[i] = nums[0] + nums[1] + ... + nums[i-1].
        // Then for each index, the left sum is P[i], and the right sum is P[P.length - 1] - P[i] - nums[i].
        int allSum = 0;
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            allSum+= nums[i];
        }
        if (allSum == 0) return 0;

        for (int i = 1; i < nums.length; i++) {
            leftSum+= nums[i-1];
            if (leftSum == allSum - nums[i] - leftSum) return i;
        }
        return -1;
    }
}
