package ru.kpecmuk.sort;

import java.util.Arrays;

/**
 * Created by User on 10.02.2017.
 */
public class MergeSort {
    private int[] array;

    /**
     * Конструктор сохраняет массив
     *
     * @param array массив int[]
     */
    public MergeSort(int[] array) {
        this.array = array;
    }

    public void ShowArray() {
        System.out.println("Array: " + Arrays.toString(this.array));
    }

    /**
     * Возвращает ссылку на массив int[]
     */
    public int[] getArray() {
        return this.array;
    }

    /**
     * Сортировка слиянием
     *
     * @param array
     */
    public void Sort(int[] array) {
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
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    private int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
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