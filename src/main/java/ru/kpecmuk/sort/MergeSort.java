package ru.kpecmuk.sort;

import java.util.Arrays;

/**
 * MERGE SORT
 * Created by Kpecmuk on 10.02.2017.
 */
class MergeSort {
    private int[] array;

    /**
     * Конструктор сохраняет массив
     *
     * @param array массив int[]
     */
    MergeSort(int[] array) {
        this.array = array;
    }

    void ShowArray() {
        System.out.println("Array: " + Arrays.toString(this.array));
    }

    /**
     * Возвращает ссылку на массив int[]
     */
    int[] getArray() {
        return this.array;
    }

    /**
     * Сортировка слиянием
     * copyOfRange сам выделяет память под массив
     *
     * @param array Массив для сортировки
     */
    void Sort(int[] array) {
        if (array.length > 1) {
            int half = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, half);
            int[] right = Arrays.copyOfRange(array, half, array.length);
            Sort(left);
            Sort(right);
            merge(array, left, right);
        }
    }

    /**
     * Изначально левый и правый массивы уже отсортированы
     * Надо только путем сравнения выстроить результат в массив result,
     * сравнивая и передвигая итераторы leftPos и rightPos
     *
     * @param result Объединённый отсортированный массив
     * @param left   левый массив
     * @param right  правый массив
     */
    private void merge(int[] result, int[] left, int[] right) {
        int leftArrayPos = 0;
        int rightArrayPos = 0;
        for (int i = 0; i < result.length; i++) {
            if (rightArrayPos >= right.length || (leftArrayPos < left.length && left[leftArrayPos] <= right[rightArrayPos])) {
                result[i] = left[leftArrayPos];
                leftArrayPos++;
            } else {
                result[i] = right[rightArrayPos];
                rightArrayPos++;
            }
        }
    }
}