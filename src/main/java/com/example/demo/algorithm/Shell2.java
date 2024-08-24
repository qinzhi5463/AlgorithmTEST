package com.example.demo.algorithm;

public class Shell2 {


    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 9, 1, 21, 5, 6, 7};

        for (int num = arr.length / 2; num > 0; num /= 2) {
            for (int i = num; i < arr.length; i++) {
                int key = arr[i];
                int j = i;
                while (j >= num && arr[j - num] > key) {
                    arr[j] = arr[j - num];
                    j -= num;
                }
                arr[j] = key;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }


}
