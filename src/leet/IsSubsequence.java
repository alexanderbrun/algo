package leet;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdcb"));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int sLen = charS.length;
        int tLen = charT.length;

        if (sLen == 0) return true;
        if (sLen > tLen) return false;

        boolean res = false;
        int pivot = 0;

        for (int i = 0; i < sLen; i++) {
            if (pivot >= tLen) return false;
            for (int j = pivot; j < tLen; j++) {
                res = false;
                if (charS[i] == charT[j]) {
                    pivot = j + 1;
                    res = true;
                    break;
                }
                if (j == tLen-1) return false;
            }
        }

        return res;
    }
}
