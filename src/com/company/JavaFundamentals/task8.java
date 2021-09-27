package com.company.JavaFundamentals;

import java.util.ArrayList;

public class task8 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 1, 6};
        int[] b = new int[]{1, 1, 1};
        int[] res = getPlaces(a, b);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    private static int[] getPlaces(int[] arr1, int[] arr2) {
        ArrayList<Integer> temp = new ArrayList<>();
        int[] indexes = new int[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            temp.add(arr1[i]);
        }
        int i = 0, j = 0;
        while (i < temp.size() && j < arr2.length) {
            if (arr2[j] <= temp.get(i)) {
                temp.add(i, arr2[j]);
                indexes[j] = i;
                j++;
            }
            i++;
        }
        while (j < arr2.length) {
            indexes[j] = i++;
            j++;
        }
        return indexes;
    }
}
