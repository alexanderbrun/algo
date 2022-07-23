package generics.wildcards2;

public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {

    T[] vals;

    public MinMaxImpl(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
        return null;
    }

    @Override
    public T max() {
        return null;
    }
}
