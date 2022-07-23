package leet;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        //42 ms
        System.out.println(isValid("()[]{}"));

        //1 ms - use stack O(n)
        System.out.println(isValid2("()[]{}"));
    }

    public static boolean isValid(String s) {
        String[] arr = new String[]{"()", "[]", "{}"};

        boolean isReplacement = true;
        while (isReplacement) {
            isReplacement = false;
            for (String pair :
                    arr) {
                if (s.contains(pair)) {
                    s = s.replace(pair, "");
                    isReplacement = true;
                } else if (s.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid2(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Character pop = null;
        for (char c : s.toCharArray()) {
            switch (c) {
                case ('('):
                    stack.push('(');
                    break;
                case ('{'):
                    stack.push('{');
                    break;
                case ('['):
                    stack.push('[');
                    break;
                case (')'):
                    pop = stack.pollFirst();
                    if (pop == null) return false;
                    if (!pop.equals('(')) {
                        return false;
                    }
                    break;
                case ('}'):
                    pop = stack.pollFirst();
                    if (pop == null) return false;
                    if (!pop.equals('{')) {
                        return false;
                    }
                    break;
                case (']'):
                    pop = stack.pollFirst();
                    if (pop == null) return false;
                    if (!pop.equals('[')) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return (stack.pollFirst() == null);
    }


}
