package com.company.JavaFundamentals;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=(int)Math.round(Math.random()*100);
        }
        int[][] A = getMatrix(arr);
        printMatrix(A);
    }

    private static int[][] getMatrix(int[] arr){
        int n = arr.length+1;
        int[][] matrix = new int[n][n];
        int counter=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[counter%arr.length];
                counter++;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] A){
        for(int i=0;i<A.length;i++){
            System.out.print("[");
            for(int j=0;j<A[0].length;j++){
                System.out.printf("%3d",A[i][j]);
            }
            System.out.println("]");
        }
    }
}
