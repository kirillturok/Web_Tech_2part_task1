package com.company.JavaFundamentals;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (isTrue(x,y)){
            System.out.println("Точка принадлежит области.");
        }
        else{
            System.out.println("Точка не принадлежит области.");
        }
    }

    public static boolean isTrue(int x,int y) {
        boolean inUpper = x>=-4 && x<=4 && y>=0 && y<=5;
        boolean inBottom = x>=-6 && x<=6 && y<=0 && y>=-3;
        return inUpper || inBottom;

    }
}
