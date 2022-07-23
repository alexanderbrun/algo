package generics.wildcards2;

public class GenConstructor {
    private double val;

    public <T extends Number> GenConstructor(T val) {
        this.val = val.doubleValue();
    }
}
