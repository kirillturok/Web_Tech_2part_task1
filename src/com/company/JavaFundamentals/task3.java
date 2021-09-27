package com.company.JavaFundamentals;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a, b, h");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        for (double i = a; i <= b; i += h){
            System.out.printf("|%5.2f | %5.2f|\n", i, Math.tan(i));
            System.out.println("|______|______|");
        }
    }
}
