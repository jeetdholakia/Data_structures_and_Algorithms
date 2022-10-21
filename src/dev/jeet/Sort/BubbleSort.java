package dev.jeet.Sort;

import java.util.Arrays;

public class BubbleSort {

    private static void sort(int [] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < n - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        sort(new int[]{10, 8, 20, 5});
    }
}
