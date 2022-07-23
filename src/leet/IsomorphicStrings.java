package leet;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int len = s.length();
        if (len != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        for (int i = 0; i < len; i++) {
            char si = charsS[i];
            char ti = charsT[i];
            if (map.containsKey(si)) {
                if (map.get(si) != ti) return false;
            } else {
                if (map2.containsKey(ti)) {
                    if (map2.get(ti) != si) return false;
                }
                map.put(si, ti);
                map2.put(ti, si);
            }
        }
        return true;
    }
}
