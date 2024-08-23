package com.example.demo.algorithm;

public class InsertionSort {

    public static void main(String[] args) {
/**
 * 时间复杂度为O(n^2)，最好为O(n)
 */
        int arr[] = {2, 5, 3, 6, 4, 9, 21, 3};


        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j > 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            //arr[j]已经小于要插入的值，咱不是要从小到大排序嘛，就把要插入的值放在这个的后面
            arr[j+1] = key;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
