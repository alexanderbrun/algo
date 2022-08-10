package leet;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
    }

    public static int[] twoSum2(int[] nums, int target) {
        //решил достаточно легко заново через полтора месяца - стало 3мс против 15
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int key = target - num;
            if (map.containsKey(key)) {
                return new int[] {map.get(key), i};
            }
            map.put(num, i);
        }

        return new int[]{};
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, List<Integer>> numMap = new HashMap<>();
        int x;

        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            if (numMap.containsKey(x)) {
                List<Integer> indexes = numMap.get(x);
                ArrayList<Integer> ar = new ArrayList<>(indexes);
                ar.add(i);
                numMap.replace(x, ar);
            } else {
                numMap.put(x, List.of(i));
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry:
             numMap.entrySet()) {
            int key = entry.getKey();
            List<Integer> value = entry.getValue();
            if (value.size() == 2 && key*2 == target) {
                return value.stream().mapToInt(f -> f).toArray();
            }
            int diff = target - key;
            if (numMap.containsKey(diff)) {
                return new int[] {entry.getValue().get(0), numMap.get(diff).get(0)};
            }
        }
        return new int[] {0, 0};

//        for (Map.Entry<Integer, Integer> entry :
//                numMap.entrySet()) {
//            Integer value = entry.getValue();
//            int key = entry.getKey();
//            if (value > 1 && key * 2 == target) {
//                a1 = key;
//                a2 = key;
//                break;
//            } else {
//                for (Map.Entry<Integer, Integer> entry2 :
//                        numMap.entrySet()) {
//                    int key2 = entry2.getKey();
//                    if (key + key2 == target) {
//                        a1= key;
//                        a2= key2;
//                        break;
//                    }
//                }
//            }
//        }
//
//        int counter = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            if (num == a1 || num == a2) {
//                res[counter] = i;
//                counter++;
//                if (counter > 1) break;
//            }
//        }
//        return res;
    }
}
