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
     *
     * @param array Массив для сортировки
     */
    void Sort(int[] array) {
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            Sort(left);
            Sort(right);
            merge(array, left, right);
        }
    }

    private int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        System.arraycopy(array, 0, left, 0, size1);
        return left;
    }

    private int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        System.arraycopy(array, size1, right, 0, size2);
        return right;
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
        int leftPos = 0;
        int rightPos = 0;
        for (int i = 0; i < result.length; i++) {
            if (rightPos >= right.length || (leftPos < left.length && left[leftPos] <= right[rightPos])) {
                result[i] = left[leftPos];
                leftPos++;
            } else {
                result[i] = right[rightPos];
                rightPos++;
            }
        }
    }
}