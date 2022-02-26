package com.company;

import java.util.Arrays;

public class ArrayElementsSum {
    // Implement the method that calculates the sum of integer array. You should not use any loops. Use the recursion.
    public static void main(String[] args) {
        int[] arr = {1,2,65,4,32,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(getElementsSum(arr,0));
    }

    private static int getElementsSum(int[] arr, int startIndex) {
        if (startIndex == arr.length-1) return arr[startIndex];
        int sum=arr[startIndex];
        sum += getElementsSum(arr, ++startIndex);
        return sum;
    }
}
