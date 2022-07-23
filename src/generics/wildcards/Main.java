package generics.wildcards;

public class Main {
    public static void main(String[] args) {
        TwoD[] td = {new TwoD(4, 6), new TwoD(5, 7)};
        Coords<TwoD> tdCoords = new Coords<>(td);


        ThreeD[] threeD = {new ThreeD(4, 6, 9), new ThreeD(5, 7, 9)};
        Coords<ThreeD> threeDCoords = new Coords<>(threeD);




        BoundedWildcards.showXY(tdCoords);
        BoundedWildcards.showXY(threeDCoords);

//        BoundedWildcards.showXYZ(tdCoords); - COMPILE ERROR - мы ограничили этот метод только для ThreeD и его наследников
        BoundedWildcards.showXYZ(threeDCoords);
    }
}
