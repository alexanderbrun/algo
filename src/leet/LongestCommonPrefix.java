package leet;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strArr = new String[] {"flower","flow","flight"};
        String[] strArr1 = new String[] {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strArr));
        System.out.println(longestCommonPrefix(strArr1));
    }


    public static String longestCommonPrefix(String[] strs) {
        String smallStr = strs[0];
        String tempStr;
        int counter = strs[0].length();
        int tempCounter = 0;
        for (int i = 1; i < strs.length; i++) {
            tempStr = strs[i];
            tempCounter = tempStr.length();
            if (tempCounter < counter) {
                counter = tempCounter;
                smallStr = tempStr;
            }
        }

        int commonLen = smallStr.length();
        String substring = "";
        boolean notCommon = true;
        while (notCommon) {
            notCommon = false;
            substring = smallStr.substring(0, commonLen);
            for (String str:
                    strs) {
                if (!str.startsWith(substring)) {
                    notCommon = true;
                    commonLen--;
                    break;
                }
                System.out.println(substring);
                System.out.println(commonLen);
            }
        }
        return substring;


    }
}
