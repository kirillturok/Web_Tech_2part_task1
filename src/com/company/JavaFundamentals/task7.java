package com.company.JavaFundamentals;

public class task7 {
    public static void main(String[] args) {
        double[] arr = new double[]{3, 9.8, 0.2, 1, 7, 11};
        ShellSort(arr);
        for (double element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void ShellSort(double[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                double buf = array[i];
                array[i]=array[i+1];
                array[i+1]=buf;
                i = i > 0 ? i - 1 : i;
            }
        }
    }
}
