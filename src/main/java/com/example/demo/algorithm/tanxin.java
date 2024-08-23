package com.example.demo.algorithm;

public class tanxin {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 9, 1, 21, 5, 6, 7};

        int left = 0, right = arr.length - 1;
        int maxLeft = left, maxRight = right;
        int maxArea = 0;
        int currentArea = 0;
        while (left < right) {
            currentArea = (right - left) * arr[left] * arr[right];
            if (maxArea < currentArea) {
                maxArea = currentArea;
                maxLeft = left;
                maxRight = right;
            }
            if (arr[right] > arr[left]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(arr[maxLeft]);
        System.out.println(arr[maxRight]);

    }
}
