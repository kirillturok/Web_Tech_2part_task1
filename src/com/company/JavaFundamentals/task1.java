package com.company.JavaFundamentals;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        System.out.println("result = " + figureOut(x, y));
    }

    private static double figureOut(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denumerator = 2 + Math.abs(x - 2 * x / (1 + Math.pow(x * y, 2)));
        return numerator / denumerator + x;
    }
}
