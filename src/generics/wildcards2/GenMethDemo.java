package generics.wildcards2;

import java.util.Comparator;

public class GenMethDemo {

    //параметр типа объявляется до типа, возвращаемого методом

//    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
    static <T> boolean isIn(T x, T[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};

        boolean a = isIn(3, nums);
        boolean b = isIn("string", nums);
        boolean c = isIn(4.7, nums);
        boolean d = isIn(new Exception("lol"), nums);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

//        if(isIn(2, nums)) {
//            System.out.println("2 in nums");
//        } else System.out.println("2 not in nums");
//
//        String strs[] = {"ssf", "dsfsdf", "dsf", "sdfsd"};
//
//        System.out.println(isIn("ddd", strs));
//
//        System.out.println(
//                isIn("sd", strs));
//
//        GenMethDemo.<Integer, Integer>isIn(1, nums);
    }
}
