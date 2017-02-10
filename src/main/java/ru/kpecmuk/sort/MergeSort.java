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
        System.arraycopy(array, 0, left, 0, size1 - 1);
        return left;
    }

    private int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        System.arraycopy(array, 0, right, 0, size1 - 1);
        return right;
    }

    private void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
}