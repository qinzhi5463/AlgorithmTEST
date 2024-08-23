package com.example.demo.algorithm;

/**
 * 时间复杂度为 O(n^2)
 */
public class maopao {
    public static void main(String[] args) {
        int[] array = {2, 3, 6, 1, 32, 5, 7};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}