package com.example.demo.algorithm;

public class choose {
    public static void main(String[] args) {
        /**
         * 选择排序
         * 不稳定的，对于相同的元素，在排序前后，相对位置可能发生变化。
         *  （因为在使用一个属性A(分数)排序算法时，数据库中的一条记录基本不止一个属性，所以相对顺序变化了，就可能引起其他属性(身高)的改变）
         *  时间复杂度为O(n^2)
         */

        int arr[] = {2, 5, 8, 3, 98, 5, 43};

        //选择排序，本质上是每一次循环，找出数组中的最大值，及其索引，并于假定的最大值交换位置

        for (int i = 0; i < arr.length - 1; i++) {
            int index_min = i;
            int num_min = arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < num_min) {
                    num_min = arr[j];
                    index_min = j;
                }
            }
            if (index_min != i) {
                swap(arr, index_min, i);
            }

        }


        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}