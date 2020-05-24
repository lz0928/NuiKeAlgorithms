package com.louis.basic_class_01;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4, 68, 3, 2, 5, 9, 887, 34, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr,0,arr.length - 1);
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r)return;
        int mid = l + ((r-l) >> 1);
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr,l,mid,r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int p1 = l,p2 = mid + 1;
        int i= 0;
        int[] help = new int[r - l + 1];
        while (p1 <= mid && p2 <= r) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }

        while (p2 <= r) {
            help[i++] = arr[p2++];
        }

       i = 0;
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
    }
}
