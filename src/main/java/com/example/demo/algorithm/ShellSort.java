package com.example.demo.algorithm;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 6, 4, 9, 21, 3};
        printArray(arr);
        //希尔排序，相比于插入排序，多了一份增量表，按照增量的排序，先明确增量表
        for (int num = arr.length / 2; num > 0; num /= 2) {
            //这里的i++,本质上就是往后退一位，按照减半的步长寻找能插入的数列
            for (int i = num; i < arr.length; i++) {
                int key = arr[i];//每次要插入的数据
                int j = i;
                while (j > num && arr[j - num] > key) {
                    arr[j] = arr[j - num];
                    j -= num;
                }
                arr[j] = key;
            }
        }
        printArray(arr);

    }

/*    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }*/

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));

    }
}
