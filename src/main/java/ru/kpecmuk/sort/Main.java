package ru.kpecmuk.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Проверки сортировки слиянием
 * Created by Kpecmuk on 10.02.2017.
 */
public class Main {
    private static final Logger log
            = LoggerFactory.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {


        MergeSort mergeSort = new MergeSort(new int[]{10, 1, 9, 2, 8, 3, 7, 4, 6, 5});
        log.info(" --- Inside main --- Array : " + Arrays.toString(mergeSort.getArray()) + " created");

        mergeSort.Sort(mergeSort.getArray());
        mergeSort.ShowArray();
    }
}