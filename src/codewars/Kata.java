package codewars;

import java.util.Arrays;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        int[] ints = new int[a.length];
        int counter = 0;
        boolean toRes;
        for (int i = 0; i < a.length; i++) {
            toRes = true;
            int ai = a[i];
            for (int j = 0; j < b.length; j++) {
                if (b[j] == ai) {
                    toRes = false;
                    break;
                }
            }
            if (toRes) {
                ints[counter] = ai;
                counter++;
            }
        }
        int[] res = new int[counter];
        System.arraycopy(ints, 0, res, 0, counter);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
    }

}
