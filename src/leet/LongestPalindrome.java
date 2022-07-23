package leet;

import java.util.HashMap;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome2("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        Integer count;

        for (char c : s.toCharArray()) {
            count = map.get(c);
            if (count == null) {
                map.put(c, 1);
                continue;
            }
            if (count % 2 == 1) {
                res++;
            }
            map.replace(c, ++count);
        }
        res *= 2;
        return s.length() > res ? ++res : res;
    }


    public static int longestPalindrome2(String s) {
        int res = 0;
        int[] chars = new int[128];

        for (char c: s.toCharArray()) {
            chars[c]++;
        }

        for (int charOccurs: chars) {
            res += charOccurs / 2 * 2;
        }

        return s.length() > res ? ++res : res;
    }
}
