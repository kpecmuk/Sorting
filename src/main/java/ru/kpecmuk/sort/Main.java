package ru.kpecmuk.sort;

/** Проверки сортировки слиянием
 * Created by Kpecmuk on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort(new int[]{8, 1, 7, 2, 6, 3, 5, 4});

        mergeSort.ShowArray();
        mergeSort.Sort(mergeSort.getArray());
        mergeSort.ShowArray();
    }
}