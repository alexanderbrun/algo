package gcd;

public class Main {
    public static void main(String[] args) {
//        System.out.println(gcd(12, 3));
        System.out.println(gcd(3, 12));
//        System.out.println(gcd(222, 112));
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int x = p % q;
        System.out.println(x + "!" );
        return gcd(q, x);
    }
}
