package ru.kpecmuk.sort;

/**
 * Проверки сортировки слиянием
 * Created by Kpecmuk on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort(new int[]{10, 1, 9, 2, 8, 3, 7, 4, 6, 5});

        mergeSort.ShowArray();
        mergeSort.Sort(mergeSort.getArray());
        mergeSort.ShowArray();
    }
}