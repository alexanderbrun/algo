package generics;

public class TwoGen<T, V> {

    //T - имя параметра типа
    //Gen - обобщенный класс

    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    public void showType() {
        System.out.println("Типом T является " + ob1.getClass().getName());
        System.out.println("Типом V является " + ob2.getClass().getName());
    }
}
