package generics.wildcards;

public class BoundedWildcards<T> {

    public static void showXY(Coords<?> coords) {
        final TwoD[] coords1 = coords.coords;
        for (int i = 0; i < coords1.length; i++) {
            System.out.println(coords1[i].x);
            System.out.println(coords1[i].y);
        }
    }

    //Чтобы иметь возможность вывести только те параметры, которые соответсвуют только наследникам ThreeD
    //ThreeD - служит верхней границей
    // для TwoD - будет ошибка
    public static void showXYZ(Coords<? extends ThreeD> coords) {
        final ThreeD[] coords1 = coords.coords;
        for (int i = 0; i < coords1.length; i++) {
            System.out.println(coords1[i].x);
            System.out.println(coords1[i].y);
            System.out.println(coords1[i].z);
        }
    }
}
