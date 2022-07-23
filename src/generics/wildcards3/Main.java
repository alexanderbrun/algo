package generics.wildcards3;

public class Main {
    public static void main(String[] args) {
        Gen2<Integer, String> gen2 = new Gen2<>(12, "test");
        System.out.println(gen2.getOb());
        System.out.println(gen2.getOb2());
    }
}
