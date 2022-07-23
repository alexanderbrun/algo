package generics;

public class Stats<T extends Number> {

    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    public double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }

        return sum / nums.length;
    }

    //? -  Wildcard, метасимвольный аргумент. Дает возможность параметру быть обощенным любым классом (достоверным),
    // иначе - если бы это было Stats<T> stats - то можно было бы сравнивать только объекты
    // типизированные одним классом
    public boolean sameAverage(Stats<?> stats) {
        return this.average() == stats.average();
    }

}
