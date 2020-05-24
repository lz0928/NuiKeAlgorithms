package com.louis.basic_class_01;

import java.util.Arrays;

public class Code_02_SelectionSort {

    public static void main(String[] args) {
        int[] a = {35, 78, 3, 46, 7, 2};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) minIndex = j;
            }
            Utils.swap(arr, minIndex, i);
        }
    }
}
