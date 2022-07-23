package leet;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Arrays.stream(runningSum(nums)).forEach(System.out::println);
    }


    public static int[] runningSum(int[] nums) {
        int res[] = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i-1] + nums[i];
        }
        return res;
    }
}
