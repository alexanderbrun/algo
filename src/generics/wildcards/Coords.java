package generics.wildcards;

public class Coords<T extends TwoD> {

    T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }
}
