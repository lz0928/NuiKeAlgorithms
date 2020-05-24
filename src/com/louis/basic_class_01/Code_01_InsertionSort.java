package com.louis.basic_class_01;

import java.util.Arrays;

public class Code_01_InsertionSort {

    public static void main(String[] args) {
        int[] a = {23, 53, 643, 23, 34, 123, 34234, 123};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >=0 && arr[j] > arr[j + 1]; j--) {
                Utils.swap(arr, j, j + 1);
            }
        }
    }
}
