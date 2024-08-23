package com.example.demo.algorithm;


public class fast {
    public static void main(String[] args) {
        int[] array = {2, 3, 6, 1, 32, 5, 7};
        //int key = 0;
        int left = 0, right = array.length - 1;
        huidiao(array, left, right);
        for (int num : array) {
            System.out.print(num + " ");
        }

    }

    public static int fast(int[] array, int left, int right) {
        //int key = left;//因为其中只是存储的指针，但指针指向的数据框里的数据已经改变，所以不能用这种方法
        int pivot = array[left];
        while (left < right) {

            while (left < right && array[right] >= pivot)
                right--;
            array[left] = array[right];

            while (left < right && array[left] <= pivot) {
                left++;
            }
            array[right] = array[left];
        }
        if (left == right) {
            array[left] = pivot;
        }

        return left;

    }

    public static void huidiao(int[] array, int left, int right) {
        if (left < right) {
            int key = fast(array, left, right);
            huidiao(array,left,key-1);//前部分
            huidiao(array,key+1,right);//后部分
        }

    }

//冒泡排序，比较稳定，因为不会大幅度的交换位置


}
