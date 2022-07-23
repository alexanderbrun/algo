package generics.wildcards3;

public class Gen2<T, V> extends Gen<T> {
    V ob2;

    public Gen2(T ob,V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    public V getOb2() {
        System.gc();
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }
}
