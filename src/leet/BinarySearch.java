package leet;

public class BinarySearch {
    public static void main(String[] args) {
//        System.out.println(search(new int[] {-1,0,3,5,9,12}, 9));
        System.out.println(search(new int[] {-1,0,3,5,9,12}, 2));
    }

    public static int search(int[] nums, int target) {
        int size = nums.length;
        final int NOT_FOUND = -1;
        if (size == 0) return NOT_FOUND; //крайний случай

        int left = 0; // указатели на промежуток в котором ищем
        int right = size-1;

        while (left <= right) { // пока указатели не пересеклись
            int pivot = left + (right - left) / 2; // волчок на середине отрезка
            if (nums[pivot] == target) return pivot; // если совпало - возвращаем
            else if (nums[pivot] > target) {
                right = pivot-1;  // если число больше заданного ставим правый (больший) край на место волчка
            } else if (nums[pivot] < target){
                left = pivot+1; // либо левый (меньший) на место волчка
            }
        }
        return -1; //иначе не нашли
    }



















    public static int search2(int[] nums, int target) {
        int pivot;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }
}
