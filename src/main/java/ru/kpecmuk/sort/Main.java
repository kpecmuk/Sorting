package ru.kpecmuk.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Проверки сортировки слиянием
 * Created by Kpecmuk on 10.02.2017.
 */
public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {

        log.info(" --- Inside main --- " + log.getClass().getSimpleName());
        MergeSort mergeSort = new MergeSort(new int[]{10, 1, 9, 2, 8, 3, 7, 4, 6, 5});

        mergeSort.ShowArray();
        mergeSort.Sort(mergeSort.getArray());
        mergeSort.ShowArray();
    }
}