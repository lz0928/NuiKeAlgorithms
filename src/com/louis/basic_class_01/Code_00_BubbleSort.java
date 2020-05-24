package com.louis.basic_class_01;

import java.util.Arrays;

public class Code_00_BubbleSort {

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 4, 8, 3, 6};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2)return;
        for (int end = arr.length - 1; end > 0; end--) {
            for (int j = 0; j < end; j++) {
                if (arr[j] > arr[j+1]) Utils.swap(arr,j,j+1);
            }
        }
    }

}
