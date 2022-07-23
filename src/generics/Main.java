package generics;

public class Main {

    public static void main(String[] args) {
        //Integer - аргумент типа
        Gen<Integer> iOb = new Gen<>(56);
        iOb.showType();
        int v = iOb.getOb();

        Gen<String> strOb = new Gen<>("generics test");
        strOb.showType();
        System.out.println(strOb.getOb());


        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "test two");
        tgObj.showType();
        System.out.println(tgObj.getOb1() + " " + tgObj.getOb2());


        Integer[] iNums = {1, 2, 3, 4, 5, 90};
        Stats<Integer> iGenNums = new Stats<>(iNums);
        System.out.println(iGenNums.average());

        String[] strs = {"ads", "sd"};
//        Stats<String> e = new Stats<String>(strs); - Compile error

    }

}
