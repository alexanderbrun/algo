package generics;

public class Gen<T> {

    //T - имя параметра типа
    //Gen - обобщенный класс

    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}
