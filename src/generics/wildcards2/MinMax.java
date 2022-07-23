package generics.wildcards2;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
