package leet;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char ch:
                s.toCharArray()) {
            if (hashMap.containsKey(ch)) {
                int count = hashMap.get(ch) + 1;
                hashMap.replace(ch, count);
            } else {
                hashMap.put(ch, 1);
            }
        }

        for (char ch : t.toCharArray()) {
            if (hashMap.containsKey(ch)) {
                int count = hashMap.get(ch) - 1;
                if (count < 0) return false;
                hashMap.replace(ch, count);
            } else {
                return false;
            }
        }

        return true;
    }
}
