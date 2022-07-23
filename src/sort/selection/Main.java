package sort.selection;

import java.util.Arrays;

public class Main {

    //выбираем максимум\мимнимум и вставим первым\последним
    //в следующую итерацию подается неотсортированный подмассив меньше на 1 элемент
    public static void main(String[] args) {
        int[] array = new int[] {12, 3, 7, 22, 45, 33, 4, 72, 56, 13};

        for (int i = 0; i < array.length; i++) {
            int indexOfMin = getIndexOfMin(array, i);
            int temp = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = temp;
            printArray(array);
        }
    }


    private static int getIndexOfMin(int[] arr, int index) {
        int indexOfMin = index;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] < arr[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
