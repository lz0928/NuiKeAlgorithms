package com.louis.basic_class_01;

import java.util.Arrays;

public class Code_04_QuickSort {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 4, 2, 6, 8, 6, 4, 54, 34, 53, 647, 3345, 234, 53, 23, 4324, 234, 53, 543, 2};
        quickSort(arr,0,arr.length -1);
    }

    public static void quickSort(int[] arr, int L, int R) {
        if (L >= R)return;
        int[] partition = partition(arr, L, R, arr[R]);
        quickSort(arr, L, partition[0] - 1);
        quickSort(arr,partition[1] + 1, R);
    }

    public static int[] partition(int[] arr, int L, int R, int num) {
        int less = L -1;
        int more = R + 1;
        int current = L;
        while (current < more) {
            if (arr[current] < num) {
                swap(arr, ++less, current++);
            } else if (arr[current] > num) {
                swap(arr,--more,current);
            } else {
                current++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return new int[]{less + 1, more - 1};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
