package com.company.JavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
        }
        System.out.println("Array: " + Arrays.toString(arr));
        for (int i = 0; i < N; i++) {
            if (isPrime(arr[i]))
                System.out.print(arr[i] + " ");
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        long t = Math.round(Math.sqrt(num));
        for (long i = 2; i <= t; ++i)
            if (num % i == 0) return false;
        return true;

    }
}
