package sort.quick;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{12, 3, 7, 22, 45, 33, 4, 72, 56, 13};

        quickSortArray(array);

    }

    private static void quickSortArray(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] arr, int from, int to) {

        if (from < to) {
            int partIndex = part(arr, from, to);

            quickSort(arr, from, partIndex);
            quickSort(arr, partIndex, to);

//            printArray(arr);

        }


    }

    private static int part(int[] arr, int from, int to) {
        int pivot = arr[(from + to) / 2];
        int leftIndex = from;
        int rightIndex = to;

        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }

    private static void swap(int[] arr, int leftIndex, int rightIndex) {

        int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;

        printArray(arr);
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
