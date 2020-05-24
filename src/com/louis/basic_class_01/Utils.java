package com.louis.basic_class_01;

public class Utils {

    public static void swap(int[] arr, int i, int j) {
        /*int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;*/

        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
