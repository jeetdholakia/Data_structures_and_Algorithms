package dev.jeet.Sort;

import java.util.Arrays;

public class SelectionSort {
    private static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int min_ind = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        sort(new int[]{10, 8, 20, 5});
    }
}
