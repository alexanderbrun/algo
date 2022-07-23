package leet;

import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
//        Symbol       Value
//        I             1
//        IV             4
//        V             5
//        IX             9
//        X             10
//        XL             40
//        L             50
//        XC             90
//        C             100
//        CD             400
//        D             500
//        CM             900
//        M             1000

//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.

        String year = "LVIII";
        String year2 = "MCMXCIV";

        

        System.out.println(romanToInt(year));
        System.out.println(romanToInt(year2));

    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = Map.of("I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );

        Map<String, Integer> map2 = Map.of(
                "IV", 4,
                "IX", 9,
                "XL", 40,
                "XC", 90,
                "CD", 400,
                "CM", 900
        );
        int res = 0;
        int length;

        for (Map.Entry<String, Integer> entry:
             map2.entrySet()) {
            length = s.length();
            s = s.replace(entry.getKey(), "");
            if (s.length() < length) {
                res += entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry:
             map.entrySet()) {
            length = s.length();
            s = s.replace(entry.getKey(), "");
            if (s.length() < length) {
                res += entry.getValue() * (length - s.length());
            }
        }

        return res;
    }
}
