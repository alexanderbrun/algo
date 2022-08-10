package leet;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        //22 ms, а нижнее решение 100 ms -
        // то насколько сильно влияет порядок операторов и условий в преобразованиях
        char[] charArray = s.toLowerCase()
                .replaceAll("[^a-z0-9]", "")
                .toCharArray();

        int len = charArray.length;
        for (int i = 0; i < len; i++) {
            int iEnd = len - i - 1;

            if (charArray[iEnd] != charArray[i]) return false;
            if (iEnd <= i) break;
        }
        return true;
    }

//    public static boolean isPalindrome(String s) {
//        char[] charArray = s.replaceAll("[^A-Za-z0-9]", "")
//                .toLowerCase()
//                .toCharArray();
//
//        int len = charArray.length;
//        for (int i = 0; i < len; i++) {
//            int iEnd = len - i - 1;
//
//            char y = charArray[i];
//            char j = charArray[iEnd];
//
//            if (y != j) return false;
//            if (iEnd <= i) break;
//        }
//        return true;
//    }
}
